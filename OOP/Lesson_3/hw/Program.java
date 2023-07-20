package OOP.Lesson_3.hw;

public class Program {
    public static void main(String[] args) {
        FileRepository<TxtFile> txtStorage = new FileRepository<>("txtStorage");
        txtStorage.add(new TxtFile("doc1.txt"));
        txtStorage.add(new TxtFile("doc2.txt"));
        
        for (int index = 0; index < txtStorage.count(); index++) {
            System.out.println(txtStorage.get(index));
        }
        
        FileRepository<PdfFile> pdfStorage = new FileRepository<>("pdfStorage");
        pdfStorage.add(new PdfFile("book1.pdf"));
        pdfStorage.add(new PdfFile("book2.pdf"));

        for (int index = 0; index < pdfStorage.count(); index++) {
            System.out.println(pdfStorage.get(index));
        }
        
    }
}
