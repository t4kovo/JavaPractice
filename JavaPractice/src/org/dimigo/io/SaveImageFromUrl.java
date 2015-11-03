/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 * 	|_ SaveImageFromUrl.java
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 22.
 * </pre>
 * 
 * @author	: 최은선
 * @version	: 1.0
 */
public class SaveImageFromUrl {
    public static void main(String[] args) {
        String imgURL = "http://i1.daumcdn.net/thumb/R750x0/?fname=http%3A%2F%2Fcfile30.uf.tistory.com%2Fimage%2F26436B3A53C8EA16119810";
        try {
            URL url = new URL(imgURL);
            InputStream is = url.openStream();
            OutputStream os = new FileOutputStream("files/vzzang.jpg");
            int result;
            byte[] buf = new byte[100];
            while((result = is.read(buf)) != -1) {
                os.write(result);
            }
            System.out.println("파일 생성 완료");
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}