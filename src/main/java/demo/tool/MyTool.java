package demo.tool;

import java.io.InputStream;
import java.util.Properties;

public class MyTool {
    private static Properties properties = null;
    public final static void init(){
        if(properties==null){
            synchronized (MyTool.class){
                if(properties!=null){
                    return;
                }
                try(InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("conf.properties")){
                    properties = new Properties();
                    properties.load(inputStream);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static final String getProp(String name){
        init();
        return properties.getProperty(name);
    }


}
