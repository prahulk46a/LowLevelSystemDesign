package SolidPrinciples.Principle2_OpenClosedPrinciple.Example2.BetterCode;

public class PDFReportGenerator implements ReportGenerator{

    @Override
    public String generate() {
        return "PDF report";
    }
}
