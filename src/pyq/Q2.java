/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author JiaWen
 * @param <E>
 */
public class Q2<E> {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File xmlFile = new File("test.xml");
        Reader fileReader = new FileReader(xmlFile);
        BufferedReader bufReader = new BufferedReader(fileReader);
        StringBuilder sb = new StringBuilder();
        String line = bufReader.readLine();
        
        while( line != null){ 
            sb.append(line).append("\n"); 
            line = bufReader.readLine(); 
        } 
        String xml2String = sb.toString(); 
        bufReader.close();
        System.out.println(isXMLMatched(xml2String));
    }
    
    public static String isXMLMatched(String xml2String){
        Stack<String> buffer = new Stack<>();
        int i = 0;
        int j=xml2String.indexOf('<');// find first'<'character(if any)
        String root = null;
        while(j!=-1){
        i++;
        
        int k=xml2String.indexOf('>',j+1);// find next'>'character
        if(k == -1)
          return "no closing tag";// invalid tag
        String tag = xml2String.substring(j+1,k);// strip away<>
        if(i == 1)
            root = xml2String.substring(j+1,k);
        if(i != 1){
            if(root.equals(tag))
                return "duplicated root tag!";
        }
        if(!tag.startsWith("/"))// this is an opening tag
          buffer.push(tag);
        else{// this isaclosing tag
          if(buffer.isEmpty())
             return "No tag to match";// no tag to match
          if(!tag.substring(1).equals(buffer.pop()))
             return String.format(" beginning element <" + buffer.pop() + "> INvalid ending element <" + tag + ">");// mismatched tag
        }
        j=xml2String.indexOf('<',k+1);// find next'<'character(if any)
    }
    return "";
    
        
    }
}
