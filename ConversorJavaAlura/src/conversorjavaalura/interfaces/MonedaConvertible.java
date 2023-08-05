package conversorjavaalura.interfaces;
import conversorjavaalura.enums.Moneda;
import java.math.BigDecimal;

public interface MonedaConvertible {
    BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorReal);
    BigDecimal convertirParaReal(Moneda moneda, BigDecimal valorMoneda);
}
