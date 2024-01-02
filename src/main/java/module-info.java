module org.fegrue.bmt {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.fegrue.bmt to javafx.fxml;
    exports org.fegrue.bmt;
}