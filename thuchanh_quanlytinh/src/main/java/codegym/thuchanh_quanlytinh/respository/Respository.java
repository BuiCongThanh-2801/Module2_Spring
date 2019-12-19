package codegym.thuchanh_quanlytinh.respository;

import java.util.List;

public interface Respository<T> {
    List<T> getAll();
}
