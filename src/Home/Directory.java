
package Home;

import java.util.ArrayList;
import java.util.Collection;

public class Directory implements FileSystem{
    protected String name;
    protected Collection<FileSystem> fileSystems = new ArrayList<>();
    public Directory(String name) {
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
    public void print() {
        System.out.println("-- dir " + name + " size=" + getSizeInBytes() + " bytes");
        for (FileSystem fileSystem : fileSystems){
            fileSystem.print();
        }
    }
}
