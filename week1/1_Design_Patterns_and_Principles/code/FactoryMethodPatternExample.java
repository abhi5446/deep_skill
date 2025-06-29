abstract class Doc{
    public abstract void readDoc();
}
class ConcreteWordDoc extends Doc{
    public void readDoc(){
        System.out.println("Reading Word Document");
    }
}
class ConcretePDFDoc extends Doc{
    public void readDoc(){
        System.out.println("Reading PDF Document");
    }
}
class ConcreteExcelDoc extends Doc{
    public void readDoc(){
        System.out.println("Reading Excel Document");
    }
}
abstract class DocFactory{
    abstract Doc createDoc();
}
class WordDocFactory extends DocFactory{
    Doc createDoc(){
        return new ConcreteWordDoc();
    }
}
class PDFDocFactory extends DocFactory{
    Doc createDoc(){
        return new ConcretePDFDoc();
    }
}
class ExcelDocFactory extends DocFactory{
    Doc createDoc(){
        return new ConcreteExcelDoc();
    }
}
public class FactoryMethodPatternExample{
    public static void main(String[] args) {
        DocFactory docx = new WordDocFactory();
        Doc x = docx.createDoc();
        x.readDoc();
        DocFactory pdf = new PDFDocFactory();
        Doc y = pdf.createDoc();
        y.readDoc();
        DocFactory xlxs = new ExcelDocFactory();
        Doc z = xlxs.createDoc();
        z.readDoc();
    }
}