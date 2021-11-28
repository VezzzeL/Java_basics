package Lesson_7_8;

import java.util.Random;

public class BlueRayDisc {
    Random random=new Random();
    Catalog catalog=new Catalog();
    SubCatalog subCatalog=new SubCatalog();
    Records records=new Records();

    public void discShowInfo(){
        catalog.infoCatalogs();
        subCatalog.infoSubCatalogs();
        records.infoRecords();
    }

    private class Catalog{
        int quantityOfCatalogs=random.nextInt(100);
        int totValueCatalog=random.nextInt(568_000);
        private void infoCatalogs(){
            System.out.println("Active catalogs: "+quantityOfCatalogs+" with total value : "+ totValueCatalog);
        }
    }
    private class SubCatalog{
        int quantityOfSubCatalogs=random.nextInt(50_000);
        int totValueSubCatalog =random.nextInt(100_000);
        private void infoSubCatalogs(){
            System.out.println("Active subcatalogs: "+quantityOfSubCatalogs+" with total value : "+ totValueSubCatalog);
        }
    }
    private class Records{
       int quantityOfRecords=random.nextInt(100_000);
       private void infoRecords(){
           System.out.println("Active records: "+quantityOfRecords);
       }
    }

    public static void main(String[] args) {
        BlueRayDisc blueRayDisc=new BlueRayDisc();
        blueRayDisc.discShowInfo();
    }
}
