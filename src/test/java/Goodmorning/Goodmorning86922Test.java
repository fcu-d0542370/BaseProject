package Goodmorning;

import org.junit.Assert;
import org.junit.Test;

public class Goodmorning86922Test {


    @Test
    public void main() throws Exception {

        Goodmorning86922  tringle= new Goodmorning86922(5,10,5);
        String result = tringle.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);
    }

}
