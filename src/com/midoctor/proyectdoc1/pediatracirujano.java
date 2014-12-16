package com.midoctor.proyectdoc1;

import com.midoctor.proyectdoc1.R;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



public class pediatracirujano  extends Activity {
	
	
	private Button button;
	private Button  buttonregresar;
	private String code;
	private ImageView header;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pediatracirujano);
		
		
		TextView texto = (TextView) findViewById(R.id.texto);
		header = (ImageView) findViewById(R.id.tv_header);
		button = (Button) findViewById(R.id.navegacionder);
		buttonregresar = (Button) findViewById(R.id.navegacionizq);
		WebView webView  = (WebView) findViewById(R.id.webview);
		code = this.getIntent().getStringExtra("code");
		
		if(code.equals("pediatra"))
		{
			header.setImageDrawable( getResources().getDrawable(R.drawable.headerpediatrageneral));           
		/*texto.setText(
				  "Especialidad Médica dedicada a cuidar la\n"
				+ "salud de niños y niñas desde los prematuros\n"
				+ "o recién nacidos hasta los adolescentes.\n"
				+ "Mantiene con sus revisiones continuas la\n"
				+ "integridad biológica del paciente y lo\n"
				+ "re-dirige a los especialistas cuando lo\n"
				+ "considera necesario."
				 );*/
		
		
		
		//texto.setText(Html.fromHtml("<DIV style=\"text-align:justify;color:#000000\">"+"Especialidad Médica dedicada a cuidar la salud de niños y niñas desde los prematuros o recién nacidos hasta los adolescentes. Mantiene con sus revisiones continuas la integridad biológica del paciente y lo re-dirige a los especialistas cuando lo" +"</DIV>"));
		//webView.loadData( "Especialidad Médica dedicada a cuidar la salud de niños y niñas desde los prematuros o recién nacidos hasta los adolescentes. Mantiene con sus revisiones continuas la integridad biológica del paciente y lo re-dirige a los especialistas cuando lo considera necesario.", "text/html", "UTF-8");
		webView.loadData("<html><head><meta Content-Type: text/html; charset=ISO-8859-1 /></head> "
				+ "<body><div style=text-align:justify>"
				+ "Especialidad M&eacute;dica dedicada a cuidar la salud de ni&ntilde;os y "
				+ "ni&ntilde;as desde los prematuros o reci&eacute;n nacidos hasta los "
				+ "adolescentes. Mantiene con sus revisiones continuas la integridad "
				+ "biol&oacute;gica del paciente y lo re-dirige a los especialistas cuando lo considera necesario."
				+ " </div></body></html>" ,"text/html", "UTF-8");

		}
		
		if(code.equals("neonato"))
		{
			
			header.setImageDrawable( getResources().getDrawable(R.drawable.neonatologoheader));
		
		
		webView.loadData("<html><head><meta Content-Type: text/html; charset=ISO-8859-1 /></head> "
				+ "<body><div style=text-align:justify>"
				+ "Atiende el parto y el primer mes de vida "
				+ "de un reci&eacute;n nacido, a los reci&eacute;n nacidos "
				+ "hospitalizados y atiende a ni&ntilde;os prematuros. "
				+ " </div></body></html>" ,"text/html", "UTF-8");
		
		
		}
		
		if(code.equals("reuma"))
		{   
			header.setImageDrawable( getResources().getDrawable(R.drawable.reumatologoheader));
		
		
		webView.loadData("<html><head><meta Content-Type: text/html; charset=ISO-8859-1 /></head> "
				+ "<body><div style=text-align:justify>"
				+ "Experto en diagnosticar, tratar y controlar "
				+ "a ni&ntilde;os y adolescentes con enfermedades "
				+ "complejas en articulaciones, m&uacutesculos "
				+ "huesos y &oacute;rganos como ri&ntilde;ones, pulmones, vasos sangu&iacute;neos y cerebro."
				+ " </div></body></html>" ,"text/html", "UTF-8");
		}
		
		if(code.equals("alergo"))
		{   
			header.setImageDrawable( getResources().getDrawable(R.drawable.alergologoheader));
           
		
		webView.loadData("<html><head><meta Content-Type: text/html; charset=ISO-8859-1 /></head> "
				+ "<body><div style=text-align:justify>"
				+ "El alerg&oacute;logo es un m&eacute;dico experto en el diagn&oacute;stico y tratamiento de las alergias, "
				+ "asma y enfermedades relacionadas con el sistema de defensa, por ejemplo rinitis "
				+ "al&eacute;rgica, urticarial y eczema."
				+ " </div></body></html>" ,"text/html", "UTF-8");
		}
		
		if(code.equals("odonto"))
		{
		
			header.setImageDrawable( getResources().getDrawable(R.drawable.odontopediatraheader));
			
		
		webView.loadData("<html><head><meta Content-Type: text/html; charset=ISO-8859-1 /></head> "
				+ "<body><div style=text-align:justify>"
				+ "La odontopediatr&iacute;a es la rama de la odontolog&iacute;a "
				+ "encargada de tratar a los ni&ntilde;os o reci&eacute;n nacidos hasta los adolescentes. Tratamiento "
				+ "de caries en dientes temporales o de leche."
				+ " </div></body></html>" ,"text/html", "UTF-8");
		}
		
		 
		
		
	    button.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), pediatracirujadodetalle.class);
	        	visitas.putExtra("code", code);
				startActivity(visitas);
				finish();
	        	
	          
	        }
	    });
	    
	    
	    buttonregresar.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), listamedicogeneral.class);
				startActivity(visitas);
				finish();
	        	
	          
	        }
	    });
	    
	    
		
		
	      
		
		
		
			
	}
	 @Override
	 public boolean onKeyUp(int keyCode, KeyEvent msg) {

	      switch(keyCode) {
	      case(KeyEvent.KEYCODE_BACK):
	           Intent a1_intent = new Intent(this, listamedicogeneral.class);
	           startActivity(a1_intent);
	           finish();
	           return true; 
	      }
	      return false;
	 }
	

	
	
}