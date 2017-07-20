package util;

import java.io.File;  
import java.util.Date;  
import java.text.SimpleDateFormat;  
  
import com.oreilly.servlet.multipart.FileRenamePolicy;  
  
//采用时间戳命名 
public class TimeFileRenamePolicy implements FileRenamePolicy {  
  
    public File rename(File file) {  
        String body="";  
        String ext="";  
        int pot=file.getName().lastIndexOf(".");  
        if(pot!=-1){  
            SimpleDateFormat sdf =   
                   new SimpleDateFormat("yyyyMMddHHmmss");   
            Date date = new Date();   
         body=sdf.format(date)+"";  
         ext=file.getName().substring(pot);  
        }else{  
            SimpleDateFormat sdf =   
                new SimpleDateFormat("yyyyMMddHHmmss");   
        Date date = new Date();   
         body=sdf.format(date)+"";  
         ext="";  
        }  
        String newName=body+ext;  
        file=new File(file.getParent(),newName);  
        return file;  
    }  
}  