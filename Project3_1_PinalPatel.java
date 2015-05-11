/* Description: This main class creates 54 objects and stores them in a 2D array. The information contained in each object is
printed out to a text file. This text file will be used by the second program. */
// Name: Pinal Mahesh Patel
// Date: 12/1/2014

import java.util.Arrays;
import java.io.*;


public class Project3_1_PinalPatel {


 public static void main(String[] args) throws IOException {
   
   int x = 6, y =8;
   
  
  ppf_3_1[][] twoArray = new ppf_3_1[x][y];
  

  twoArray[0][0]=new ppf_3_1("Pinal Patel","Pilot","Manish Shah","Cabin","n/a","n/a","7063803555","n/a","7063803829","n/a","7","n/a"); //pilot
  twoArray[0][1]=new ppf_3_1("Ben Smith","Pilot","Debbie Smith","Cabin","n/a","n/a","7063335555","n/a","7063358888","n/a","6","n/a"); //pilot
  twoArray[0][2]=new ppf_3_1("John Dond","n/a","Jena Dond","A6","MC","3344556677889900","7064449999","1","7062222222","paid","n/a","n/a");
  twoArray[0][3]=new ppf_3_1("Hank Aaro","n/a","Cindy Aaro","A7","VISA","1111222233334444","5086665555","2","5082227777","paid","n/a","n/a");
  twoArray[0][4]=new ppf_3_1("Abby Fate","n/a","Aden Fate","A8","VISA","9999888877774444","6322569874","3","6325461234","paid","n/a","n/a");
  twoArray[0][5]=new ppf_3_1("Cleo Kent","n/a","Rush Kent","A9","MC","5555666688882222","2316652244","4","2315554444","paid","n/a","n/a");
  twoArray[0][6]=new ppf_3_1("Adah Coby","n/a","Foch Coby","A10","VISA","9854326512485632","1472583698","5","1479876541","paid","n/a","n/a");
  twoArray[0][7]=new ppf_3_1("Clem Ruie","n/a","Codi Ruie","A11","VISA","6655445533221144","3571591234","6","3572581238","paid","n/a","n/a");
  

  twoArray[1][0]=new ppf_3_1("Adam Flor","Pilot","Sada Flor","Cabin","n/a","n/a","3213698888","n/a","3219998888","n/a","5","n/a"); //pilot
  twoArray[1][1]=new ppf_3_1("Abel Mona","Pilot","Clem Mona","Cabin","n/a","n/a","6548885555","n/a","6543214382","n/a","2","n/a"); //pilot
  twoArray[1][2]=new ppf_3_1("Acey Kari","n/a","Myer Kari","A12","MC","1298365419873654","5036045236","7","5036857459","paid","n/a","n/a");
  twoArray[1][3]=new ppf_3_1("Coby Coen","n/a","Sara Coen","A13","MC","9635123584539634","2033576547","8","2039543654","paid","n/a","n/a");
  twoArray[1][4]=new ppf_3_1("Adan Roza","n/a","Mya Roza","A14","MC","9512365478525684","3214569584","9","3215694568","paid","n/a","n/a");
  twoArray[1][5]=new ppf_3_1("Kati Ruth","n/a","Myla Ruth","A15","VISA","9654325874153256","3215209526","10","3218529632","paid","n/a","n/a");
  twoArray[1][6]=new ppf_3_1("Fawn Ruels","n/a","Jane Ruels","A16","MC","3657123654853258","3692581478","11","3692587536","paid","n/a","n/a");
  twoArray[1][7]=new ppf_3_1("Myrl Faulk","n/a","James Faulk","A17","VISA","1236958745269587","3265488526","12","3269875245","paid","n/a","n/a");
  

  twoArray[2][0]=new ppf_3_1("Kaya Russ","Pilot","Sada Russ","Cabin","n/a","n/a","2543658457","n/a","2548657895","n/a","7","n/a"); //pilot
  twoArray[2][1]=new ppf_3_1("Nada Sage","Pilot","Ada Sage","Cabin","n/a","n/a","3697856542","n/a","3697854596","n/a","5","n/a"); //pilot
  twoArray[2][2]=new ppf_3_1("Mose Nell","n/a","Ryne Nell","A18","MC","3256452145263698","6987545652","13","6985452365","paid","n/a","n/a");
  twoArray[2][3]=new ppf_3_1("Alex Amos","n/a","Neta Amos","A19","VISA","3265452654654562","5461254587","14","5462654583","paid","n/a","n/a");
  twoArray[2][4]=new ppf_3_1("Kobi Niko","n/a","Niha Niko","A20","VISA","2356235412351547","1235467895","15","1238795267","paid","n/a","n/a");
  twoArray[2][5]=new ppf_3_1("Shay Kim","n/a","Yong Kim","A21","MC","1236456878954562","1239874562","16","1236598745","paid","n/a","n/a");
  twoArray[2][6]=new ppf_3_1("Jung Kwai","n/a","Hung Kwai","A22","VISA","9564325465471285","6784561235","17","6783653369","paid","n/a","n/a");
  twoArray[2][7]=new ppf_3_1("Shep Koda","n/a","Shae Koda","A23","VISA","1236785469546635","6784160185","18","6785552222","paid","n/a","n/a");
  


  twoArray[3][0]=new ppf_3_1("Sena Seth","Pilot","Shon Seth","Cabin","n/a","n/a","4525687895","n/a","4523698785","n/a","4","n/a"); //pilot
  twoArray[3][1]=new ppf_3_1("John Sucks","Pilot","James Sucks","Cabin","n/a","n/a","6543256587","n/a","6549873265","n/a","3","n/a"); //pilot
  twoArray[3][2]=new ppf_3_1("Knox Geri","n/a","Gary Geri","A24","VISA","3654555574856958","6789632587","19","6783256589","paid","n/a","n/a");
  twoArray[3][3]=new ppf_3_1("Nena Nels","n/a","Ham Nels","A25","MC","9658474512362542","6789513578","20","6783498627","paid","n/a","n/a");
  twoArray[3][4]=new ppf_3_1("Shen Sina","n/a","Skip Sina","A26","VISA","6358745265982222","7063555555","21","7069513597","paid","n/a","n/a");
  twoArray[3][5]=new ppf_3_1("Neva Kole","n/a","Kirtes Kole","A27","MC","6398435962781365","7069459555","22","7069846548","paid","n/a","n/a");
  twoArray[3][6]=new ppf_3_1("Taft Tajas","n/a","Noma Tajas","A28","MC","5555666611119999","7068889513","23","7063338454","paid","n/a","n/a");
  twoArray[3][7]=new ppf_3_1("Dale Dara","n/a","Kiya Dara","A29","MC","7777856499991111","7069542232","24","7069875645","paid","n/a","n/a");


  twoArray[4][0]=new ppf_3_1("Aldo Daja","Pilot","Cruz Daja","Cabin","n/a","n/a","7069513587","n/a","7069997563","n/a","9","n/a"); //pilot
  twoArray[4][1]=new ppf_3_1("Dane Ally","Pilot","Newt Ally","Cabin","n/a","n/a","5487896545","n/a","5489635452","n/a","8","n/a"); //pilot
  twoArray[4][2]=new ppf_3_1("Lera Lane","n/a","Louan Lane","A30","MC","2546666684597777","7069546585","25","706987585","paid","n/a","n/a");
  twoArray[4][3]=new ppf_3_1("Lela Dane","n/a","Hong Dane","A31","MC","6548745896545254","7069635585","26","7062588524","paid","n/a","n/a");
  twoArray[4][4]=new ppf_3_1("Arba Desi","n/a","Geta Desi","A32","VISA","6584568565478563","7069583569","27","7067895453","paid","n/a","n/a");
  twoArray[4][5]=new ppf_3_1("Octa Gona","n/a","Deca Gona","A33","VISA","3355447799882255","7069854111","28","7069996666","paid","n/a","n/a");
  twoArray[4][6]=new ppf_3_1("Tina Tiny","n/a","Dane Tiny","A34","VISA","7412321496328526","7065463578","29","7062227777","paid","n/a","n/a");
  twoArray[4][7]=new ppf_3_1("Barb Bara","n/a","Darp Bara","A35","VISA","8524369873596454","5449876523","30","5443697193","paid","n/a","n/a");
  

  twoArray[5][0]=new ppf_3_1("Oran Vela","Pilot","Tula Vela","Cabin","n/a","n/a","5645829517","n/a","5648533798","n/a","8","n/a"); //pilot
  twoArray[5][1]=new ppf_3_1("Lodas Orins","Pilot","Cortes Orins","Cabin","n/a","n/a","5238547895","n/a","5238889785","n/a","4","n/a"); //pilot
  twoArray[5][2]=new ppf_3_1("Duke Duff","n/a","Orma Duff","A36","MC","7412852695487856","9637854444","31","9638524598","paid","n/a","n/a");
  twoArray[5][3]=new ppf_3_1("Vela Otho","n/a","Loma Otho","A37","MC","7895364578634856","7893654747","32","7895456666","paid","n/a","n/a");
  twoArray[5][4]=new ppf_3_1("Avis Eber","n/a","Bama Eber","A38","MC","7896555547652222","4568792563","33","4569997777","paid","n/a","n/a");
  twoArray[5][5]=new ppf_3_1("Axel Folys","n/a","Ivah Folys","A39","MC","7413654845986547","7065559999","34","7068789999","paid","n/a","n/a");
  twoArray[5][6]=new ppf_3_1("Bode Elons","n/a","Lita Elons","A40","MC","7896547895681475","7065551978","35","7063214568","paid","n/a","n/a");
  twoArray[5][7]=new ppf_3_1("Isom Irvas","n/a","Omie Irvas","A41","MC","5555222244447777","7061111111","36","7065555222","paid","n/a","n/a");
  
  
 
  PrintWriter obj = new PrintWriter(new FileWriter("info.txt")); 

  int flight = 2250; 
  
  for(int i=0; i<twoArray.length; i++){
    obj.println();
    obj.println("***********************************************************************************************************************************************************************");
    
     flight += 1;
    obj.println ("Flight Number:"+flight);

    
    for(int j=0; j<twoArray[i].length; j++){
       obj.println(twoArray[i][j]);       
    }
  }

  obj.close();
  System.out.println("info.txt has been created!");
  
 }
 

 
}


