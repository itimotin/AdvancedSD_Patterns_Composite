package Home;

import java.util.ArrayList;
import java.util.Collection;

public class Drive implements FileSystem {
    protected String name;

    protected Collection<FileSystem> fileSystems = new ArrayList<>();
    public Drive(String name) {
        this.name = name;
    }
    public void addFileSystem(FileSystem fileSystem){
        fileSystems.add(fileSystem);
    }
    public int getSizeInBytes(){
        int sizeInBytes=0;
        for (FileSystem fileSystem : fileSystems){
            sizeInBytes+=fileSystem.getSizeInBytes();
        }
        return sizeInBytes;
    }
    public void print(){
        System.out.println("- drive "+name);
        for (FileSystem fileSystem : fileSystems){
            fileSystem.print();
        }
    }
}
