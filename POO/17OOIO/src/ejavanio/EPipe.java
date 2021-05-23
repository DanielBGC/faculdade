/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejavanio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

/**
 *
 * @author EDYA
 */
//http://tutorials.jenkov.com/java-io/index.html
//http://tutorials.jenkov.com/java-nio/index.html
public class EPipe {
    public static void main(String[] args) throws IOException {
//Creating a Pipe
//You open a Pipe by calling the Pipe.open() method. Here is how that looks:
/*
Pipe pipe = Pipe.open();
*/


//Writing to a Pipe
//To write to a Pipe you need to access the sink channel. Here is how that is done:
/*
Pipe.SinkChannel sinkChannel = pipe.sink();
*/

//You write to a SinkChannel by calling it's write() method, like this:
    /*
        String newData = "New String to write to file..." + System.currentTimeMillis();

    ByteBuffer buf = ByteBuffer.allocate(48);
    buf.clear();
    buf.put(newData.getBytes());

    buf.flip();

    while(buf.hasRemaining()) {
        sinkChannel.write(buf);
    }
    */
//Reading from a Pipe
//To read from a Pipe you need to access the source channel. Here is how that is done:
/*
Pipe.SourceChannel sourceChannel = pipe.source();
*/

//To read from the source channel you call its read() method like this:
/*
        ByteBuffer buf = ByteBuffer.allocate(48);

int bytesRead = inChannel.read(buf);
*/
//The int returned by the read() method tells how many bytes were read into the buffer.
    }
}
