package projeto.monitoramentoestoque.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import projeto.monitoramentoestoque.model.Insumo;

@Dao
public interface RoomInsumoDAO {

    @Query("SELECT * FROM insumo")
    List<Insumo> todos();

    @Query("SELECT * FROM insumo WHERE id IN (:insumoIds)")
    List<Insumo> loadAllByIds(Long insumoIds);

    @Insert
    void salva(Insumo insumo);

    @Delete
    void remove(Insumo insumo);
}
