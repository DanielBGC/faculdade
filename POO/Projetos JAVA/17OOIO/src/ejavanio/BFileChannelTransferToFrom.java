/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejavanio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 *
 * @author EDYA
 */
//http://tutorials.jenkov.com/java-io/index.html
//http://tutorials.jenkov.com/java-nio/index.html
public class BFileChannelTransferToFrom {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //copy content from source to destination
        
        RandomAccessFile fromFile = new RandomAccessFile("src/files/source.txt", "rw");
        FileChannel fromChannel = fromFile.getChannel();

        RandomAccessFile toFile = new RandomAccessFile("src/files/destination.txt", "rw");
        FileChannel toChannel = toFile.getChannel();

        long position = 0;
        long count = fromChannel.size();

        toChannel.transferFrom(fromChannel, position, count);
        
        
        /*
         RandomAccessFile fromFile = new RandomAccessFile("src/files/source.txt");
         FileChannel      fromChannel = fromFile.getChannel();

         RandomAccessFile toFile = new RandomAccessFile("src/files/destination.txt", "rw");
         FileChannel      toChannel = toFile.getChannel();

         long position = 0;
         long count    = fromChannel.size();

         fromChannel.transferTo(position, count, toChannel);
         */
    }
}
