package Goodmorning_hsu;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Goodmorning86922Test {


    @Test
    public void main() throws Exception {

        Goodmorning86922  tringle= new Goodmorning86922(5,10,5);
        String result = tringle.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);
    }

}
