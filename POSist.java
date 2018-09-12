import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

     public static void main(String []args){


        System.out.println("Hello World");
     }
     
     public class node{
         
         Timestamp timestamp;
         ArrayList<Data> data;
         int nodenumber;
         String nodeId,
                referenceNodeId,
                childeReferenceNodeId,
                genesisReferenceNodeId;
                
                
         
         
     }
     
     public class Data{
         String ownerid;
         float value;
         String ownername;
          @Override
    public int hashCode() {
      /*  int result = 17;
        result = 37*result + ownerid.hashCode();
        result = 37*result + (int)value;
        result=37*result + ownername.hashCode();
        return result;*/
        return java.util.Objects.hash(ownerid, value,ownername);

    }
     }
}
