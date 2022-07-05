package demo.tool;

import org.junit.Test;

public class MyToolTest {
    @Test
    public void testGetProp(){
        System.out.println(MyTool.getProp("conf.env.str"));
    }
}
