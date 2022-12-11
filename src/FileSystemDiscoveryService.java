import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileSystemDiscoveryService {

    public void findAllFilePathsWithRecursion(Path startingPath) throws IOException{
        List<Path> directoryContent = Files.list(startingPath).collect(Collectors.toList());
        for (Path path: directoryContent) {
           if(Files.isDirectory(path)){
               findAllFilePathsWithRecursion(path);
           }else {
               System.out.println(path);
           }
        }
    }
    public void findAllFilePaths(Path startingPath) throws IOException {
        List<Path> directoryContent = Files.list(startingPath).collect(Collectors.toList());
        List<Path> files = new ArrayList<>();
        List<Path> folders = new ArrayList<>();
        for (Path path: directoryContent) {
            if(Files.isRegularFile(path)){
                files.add(path);
            }else {
                folders.add(path);
            }
        }
        for (int i = 0; i < folders.size(); i++) {
            List<Path> innerFolderContent = Files.list(folders.get(i)).collect(Collectors.toList());
            for (Path path: innerFolderContent) {
                if(Files.isRegularFile(path)){
                    files.add(path);
                }else {
                    folders.add(path);
                }
            }
        }
        for (Path file :files) {
            System.out.println(file);
        }
    }
}
