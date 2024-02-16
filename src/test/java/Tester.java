

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class Tester {

   @Test
   public void partA () {
    opm.add(new Gizmo("ABC",true));
    opm.add(new Gizmo("ABC",false));
    opm.add(new Gizmo("XYZ",true));
    opm.add(new Gizmo("lmnop",false));
    opm.add(new Gizmo("ABC",true));
    opm.add(new Gizmo("ABC",false));
    int abc = opm.countElectronicsByMaker("ABC")
    assertEquals(partAFail(2,abc,"ABC"),2,abc);
      
    int lmnop = opm.countElectronicsByMaker("lmnop");
    assertEquals(partAFail(0,lmnop,"lmnop"),0,lmnop);

    int xyz = opm.countElectronicsByMaker("XYZ")
    assertEquals(partAFail(1,xyz,"XYZ"),1,xyz);

   int qrp = opm.countElectronicsByMaker("QRP")
    assertEquals(partAFail(0,qrp,"QRP"),0,qrp);
   }

   @Test
   public void partB(){
         opm.add(new Gizmo("ABC",true));
        opm.add(new Gizmo("ABC",false));
       opm.add(new Gizmo("XYZ",true));
       opm.add(new Gizmo("lmnop",false));
       opm.add(new Gizmo("ABC",true));
       opm.add(new Gizmo("ABC",false));
       assertEquals(false,opm.hasAdjacentEqualPair());
       opm.add(new Gizmo("ABC",false));
       assertEquals(true,opm.hasAdjacentEqualPair());
   }

   private String partAFail(int expected, int real, String maker){
      return "Expected " + expected + " with countElectronicsByMaker(\"" + maker + "\"), but output was " + real;
   }


}
