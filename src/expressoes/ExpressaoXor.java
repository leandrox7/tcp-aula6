package Expressoes;

import java.util.Map;

public class ExpressaoXor extends ExpressaoBinaria {

	public ExpressaoXor(ExpressaoLogica a, ExpressaoLogica b) {
	
			super(a, b);
			// TODO Auto-generated constructor stub
		}
		
		
		@Override
		public String toString() {
			return "(" + super.getExpressaoLogica().toString() + " xor " + super.getExpressaoLogica2().toString() + ")";
		}

	    @Override
	    public boolean eval(Map<String, Boolean> valoresVariaveis) {
	        return (super.getExpressaoLogica().eval(valoresVariaveis) ^ super.getExpressaoLogica2().eval(valoresVariaveis));
	    }
}
