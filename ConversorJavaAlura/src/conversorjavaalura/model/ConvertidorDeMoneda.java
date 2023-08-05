package conversorjavaalura.model;
import conversorjavaalura.enums.Moneda;
import conversorjavaalura.interfaces.MonedaConvertible;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConvertidorDeMoneda implements MonedaConvertible{

    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorReal) {
        return valorReal.divide(moneda.getFACTOR_CONVERSION(), 2, RoundingMode.HALF_UP);
    }
    public BigDecimal convertirParaReal(Moneda moneda, BigDecimal valorMoneda) {
        return valorMoneda.multiply(moneda.getFACTOR_CONVERSION());
    }
}
