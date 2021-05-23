/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejavanio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 *
 * @author EDYA
 */
//http://tutorials.jenkov.com/java-io/index.html
//http://tutorials.jenkov.com/java-nio/index.html
public class CFileChannel {

    public CFileChannel() throws FileNotFoundException, IOException {
/*A Java NIO FileChannel is a channel that is connected to a file. 
Using a file channel you can read data from a file, and write data to a file*/

        //Opening a FileChannel
         /*Before you can use a FileChannel you must open it. You cannot open a
         FileChannel directly. You need to obtain a FileChannel via an
         InputStream, OutputStream, or a RandomAccessFile. 
         Here is how you open a FileChannel via a RandomAccessFile:*/
        /*
         RandomAccessFile aFile     = new RandomAccessFile("src/origem.txt", "rw");
         FileChannel      inChannel = aFile.getChannel();
         */

//Reading Data from a FileChannel
/*To read data from a FileChannel you call one of the read() methods. 
         Here is an example:*/
        /*
         ByteBuffer buf = ByteBuffer.allocate(48);

         int bytesRead = inChannel.read(buf);
         */
        
        
        
        
//Writing Data to a FileChannel
/*Writing data to a FileChannel is done using the FileChannel.write() method,
 which takes a Buffer as parameter. Here is an example:*/
       
        RandomAccessFile aFile = new RandomAccessFile("src/files/destination.txt", "rw");
        FileChannel channel = aFile.getChannel();

        String newData = "New String to write to file..." + System.currentTimeMillis();

        ByteBuffer buf = ByteBuffer.allocate(48);
        buf.clear();
        buf.put(newData.getBytes());

        buf.flip();

        while (buf.hasRemaining()) {
            channel.write(buf);
        }
        channel.close();
        
        
        
        
        
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        new CFileChannel();
    }
}
