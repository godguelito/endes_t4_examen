package Refactor;

public class Report {
    public void printReport() {
        printTitle(); // llamado a la función de imprimir título
        printContent(); // llamado a la función de imprimir contenido
        printConclusion(); // llamado la función de imprimir conclusión
    }
    public void printTitle() { //imprimir título
        System.out.println("Título del Reporte");
    }
    public void printContent() { //contenido del reporte
        // contenido del reporte
        System.out.println("Contenido 1...");
        System.out.println("Contenido 2...");
        // más contenido...
    }
    public void printConclusion() { // imprimir conclusión
        System.out.println("Conclusión del Reporte");
    }

    }

