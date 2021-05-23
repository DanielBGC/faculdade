/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejavanio;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author EDYA
 */

/*
http://tutorials.jenkov.com/java-io/index.html
http://tutorials.jenkov.com/java-nio/index.html
*/
public class FJavaNIOFiles {
    public static void main(String[] args) throws IOException {
        new FJavaNIOFiles();
    }
    
    public FJavaNIOFiles() throws IOException {
/*
 Files.exists()
 The Files.exists() method checks if a given Path exists in the file system.
 It is possible to create Path instances that do not exist in the file system. For instance, if you plan to create a new directory, you would first create the corresponding Path instance, and then create the directory.
 Since Path instances may or may not point to paths that exist in the file system, you can use the Files.exists() method to determine if they do (in case you need to check that).
 Here is a Java Files.exists() example:
 */
    /*
     //Path path = Paths.get("src/files/arquivo1.txt");
     //Path path = Paths.get("src/files/arquivo2.txt");
     Path path = Paths.get("src/files/");
     //Path path = Paths.get("src/files1/");

     boolean pathExists = Files.exists(path,  new LinkOption[]{ LinkOption.NOFOLLOW_LINKS});
     System.out.println(pathExists);
     */
      
/*=========================================================================
=========================================================================*/
  
        
        
/*
Files.createDirectory()
The Files.createDirectory() method creates a new directory from a Path 
instance. Here is a Java Files.createDirectory() example:
 */
    /*
     Path path = Paths.get("src/files/subdir");
     try {
        Path newDir = Files.createDirectory(path);
     } catch(FileAlreadyExistsException e){
        // the directory already exists.
     } catch (IOException e) {
        //something else went wrong
        e.printStackTrace();
     }
 */
        
        
/*=========================================================================
=========================================================================*/    
     
/*
 Files.copy()
 The Files.copy() method copies a file from one path to another. Here is a Java NIO Files.copy() example:
*/
        /*
     Path sourcePath      = Paths.get("src/files/arquivo.txt");
     Path destinationPath = Paths.get("src/filescopy/arquivoarquivo2.txt");
     
     //copia apenas o arquivo
     //Path sourcePath      = Paths.get("src/files/");
     //Path destinationPath = Paths.get("src/filescopy1/");
     
       
     try {
        Files.copy(sourcePath, destinationPath);
     } catch(FileAlreadyExistsException e) {
        //destination file already exists
     } catch (IOException e) {
        //something else went wrong
        e.printStackTrace();
     }
     */
        
        
/*=========================================================================
=========================================================================*/
/*
 Overwriting Existing Files
 It is possible to force the Files.copy() to overwrite an existing file.
Here an example showing how to overwrite an existing file using Files.copy():
 */
      /*
     Path sourcePath      = Paths.get("src/files/arquivo.txt");
     Path destinationPath = Paths.get("src/filescopy/arquivo.txt");

     try {
        Files.copy(sourcePath, destinationPath,
        StandardCopyOption.REPLACE_EXISTING);
     } catch(FileAlreadyExistsException e) {
        //destination file already exists
     } catch (IOException e) {
        //something else went wrong
     e.printStackTrace();
     }
     */
        
        
/*=========================================================================
=========================================================================*/       
/*
Files.move()
The Java NIO Files class also contains a function for moving files from 
one path to another. Moving a file is the same as renaming it, 
except moving a file can both move it to a different directory
and change its name in the same operation. 
Yes, the java.io.File class could also do that with 
its renameTo() method, but now you have the file move
functionality in the java.nio.file.Files class too.
Here is a Java Files.move() example:
 */
    /*
     Path sourcePath      = Paths.get("src/files/move.txt");
     Path destinationPath = Paths.get("src/filescopy/movemove.txt");
     
     try {
        Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
     } catch (IOException e) {
        //moving file failed.
        e.printStackTrace();
     }
     */
/*=========================================================================
=========================================================================*/       
/*
 Files.delete()
 The Files.delete() method can delete a file or directory. 
    Here is a Java Files.delete() example:
 */
    /*
           
     //Path path = Paths.get("src/filescopy/movemove.txt");
     Path path = Paths.get("src/filescopy1/");
     try {
         Files.delete(path);
     } catch (IOException e) {
        //deleting file failed
        e.printStackTrace();
     }
     */
        
        
        
/*=========================================================================
=========================================================================*/      
/*
 Files.walkFileTree()
 The Files.walkFileTree() method contains functionality for 
traversing a directory tree recursively. The walkFileTree()
method takes a Path instance and a FileVisitor as parameters.
The Path instance points to the directory you want to traverse. 
The FileVisitor is called during traversion.
Before I explain how the traversal works, here is first the FileVisitor interface:

 public interface FileVisitor {
 public FileVisitResult preVisitDirectory(
 Path dir, BasicFileAttributes attrs) throws IOException;
 public FileVisitResult visitFile(
 Path file, BasicFileAttributes attrs) throws IOException;
 public FileVisitResult visitFileFailed(
 Path file, IOException exc) throws IOException;
 public FileVisitResult postVisitDirectory(
 Path dir, IOException exc) throws IOException {
 }
You have to implement the FileVisitor interface yourself, 
and pass an instance of your implementation to the walkFileTree()
method. Each method of your FileVisitor implementation will get 
called at different times during the directory traversal. 
If you do not need to hook into all of these methods, you 
can extend the SimpleFileVisitor class, which contains 
default implementations of all methods in the FileVisitor interface.
*/
     
        //acessa conteúdo de subpastas também
        /*
  Path path      = Paths.get("src/files/");
  Files.walkFileTree(path, new FileVisitor<Path>() {
  @Override
  public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
    System.out.println("pre visit dir:" + dir);
    return FileVisitResult.CONTINUE;
  }

  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
    System.out.println("visit file: " + file);
    return FileVisitResult.CONTINUE;
  }

  @Override
  public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
    System.out.println("visit file failed: " + file);
    return FileVisitResult.CONTINUE;
  }

  @Override
  public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
    System.out.println("post visit directory: " + dir);
    return FileVisitResult.CONTINUE;
  }
});
      */
      
        
        
 /*=========================================================================
=========================================================================*/       
        
        
/*
 Searching For Files
 Here is a walkFileTree() that extends SimpleFileVisitor to look 
   for a file named README.txt :
 */
    /*
       Path rootPath      = Paths.get("src/files/");
     final String fileToFind = File.separator + "arquivoEscrita.txt";

     try {
     Files.walkFileTree(rootPath, new SimpleFileVisitor<Path>() {
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        String fileString = file.toAbsolutePath().toString();
        //System.out.println("pathString = " + fileString);

        if(fileString.endsWith(fileToFind)){
           System.out.println("file found at path: " + file.toAbsolutePath());
           return FileVisitResult.TERMINATE;
        }
        return FileVisitResult.CONTINUE;
        }
     });
     } catch(IOException e){
        e.printStackTrace();
     }
     */
        
    
/*=========================================================================
=========================================================================*/        
        
/*
Deleting Directories Recursively
The Files.walkFileTree() can also be used to delete a directory with all
files and subdirectories inside it. The Files.delete() method will
only delete a directory if it is empty. By walking through all 
directories and deleting all files (inside visitFile()) in each 
directory, and afterwards delete the directory itself (inside 
postVisitDirectory()) you can delete a directory with all 
subdirectories and files. Here is a recursive directory deletion 
example:
 */
    /*
    Path rootPath      = Paths.get("src/delete");
     try {
     Files.walkFileTree(rootPath, new SimpleFileVisitor<Path>() {
     @Override
     public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
     System.out.println("delete file: " + file.toString());
     Files.delete(file);
     return FileVisitResult.CONTINUE;
     }

     @Override
     public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
     Files.delete(dir);
     System.out.println("delete dir: " + dir.toString());
     return FileVisitResult.CONTINUE;
     }
     });
     } catch(IOException e){
        e.printStackTrace();
     }
        */
     
  }
}
