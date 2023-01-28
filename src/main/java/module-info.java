module com.quanlynhankhau.hust.quanlynhankhau {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.quanlynhankhau.hust.quanlynhankhau to javafx.fxml;
    exports com.quanlynhankhau.hust.quanlynhankhau;
}