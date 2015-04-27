package com.midoctor.proyectdoc2;

import java.util.ArrayList;

import com.midoctor.proyectdoc2.R;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;



public class pediatracirujano  extends Activity {
	
	private  ListView ListViewopction;
	private Button button;
	private Button  buttonregresar;
	private String code;
	private ImageView header;
	private ArrayList<classespecialidades> fetch = new ArrayList<classespecialidades>();
	private adapterdirectorio adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pediatracirujano);
		 
		
		ListViewopction = (ListView) findViewById(R.id.listView2);
		
		TextView texto = (TextView) findViewById(R.id.text);
//		header = (ImageView) findViewById(R.id.tv_header);
		//button = (Button) findViewById(R.id.navegacionder);
		//buttonregresar = (Button) findViewById(R.id.navegacionizq);
		WebView webView  = (WebView) findViewById(R.id.webview);
		code = this.getIntent().getStringExtra("code");
		header = (ImageView) findViewById(R.id.tv_header);
		header.setImageDrawable( getResources().getDrawable(R.drawable.header_peidatra)); 
		if(code.equals("pediatra"))
		{
			header.setImageDrawable( getResources().getDrawable(R.drawable.header_peidatra)); 

				//header.setImageDrawable( getResources().getDrawable(R.drawable.headerpediatrageneral));           
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
	
			
		
		
		
			texto.setText("Conoce a nuestros pediatras generales:");
			//header.setImageDrawable( getResources().getDrawable(R.drawable.headerpediatraslista));      
				classespecialidades one = new
			classespecialidades("1","Dra. Eunice May Narvaez","Pediatra","8864631","nichemn01@hotmail.com","pediatra","21.15869000614639", "-86.85727299999996",
			"Av López portillo num 872 y 874 consultorio 101"+"\n"+"Primer piso SM 59 Quirúrgica del Sur."+"/n"+"Unidad Morelos Cancún Quintana Roo");
				
				classespecialidades one1 = new classespecialidades("2","Dr. José Carlos Balmaceda L.","Pediatra","8844005","jocabalo45@hotmail.com",code,"21.135900006139135", "-86.82763299999999",
			"Av. Tulum Lote 1 mza 1 consultorio 322 Sm 12 "+"\n"+" Hospital Galenia. cancún Quintana Roo CP 77505");
				
				classespecialidades one2 = new classespecialidades("3","Dr. Raúl Medina Chávez","Pediatra","8482946","raulmedina1956@hotmail.com",code,"21.1514541","-86.8414688",
			"Av. Andrés Quintana Roo  157  SM 45 Cancún Quintana Roo");
				
				classespecialidades one3 = new classespecialidades("4","Dra. Genny Santamaría Berrón","Pediatra","8482946","genny_pasitos@hotmail.com",code,"21.149954","-86.848554",
			"Av Andrés Quintana Roo num 157 Sm 45" +"\n"+"Pasitos.Cancún Quintana Roo  CP 77500");
				
				
				fetch.add(one);
				fetch.add(one1);
				fetch.add(one2);
				fetch.add(one3);
		}
		
		if(code.equals("neonato"))
		{
			header.setImageDrawable( getResources().getDrawable(R.drawable.header_neonatologo)); 

			//header.setImageDrawable( getResources().getDrawable(R.drawable.neonatologoheader));
		webView.loadData("<html><head><meta Content-Type: text/html; charset=ISO-8859-1 /></head> "
				+ "<body><div style=text-align:justify>"
				+ "Atiende el parto y el primer mes de vida "
				+ "de un reci&eacute;n nacido, a los reci&eacute;n nacidos "
				+ "hospitalizados y atiende a ni&ntilde;os prematuros. "
				+ " </div></body></html>" ,"text/html", "UTF-8");
		texto.setText("Conoce a nuestros neonatólogos:");
		classespecialidades one = new
				classespecialidades("1","Dra. Miriam Campos Rebolledo","Neonatólogo","2063549","micamre@hotmail.com",code,"21.150147", "-86.848776",
				"Av. Andrés Quinatan Roo mza 1  Consultorio 1  SM45   Edificio Roberth Koch ");
					
		classespecialidades one1 = new 
				classespecialidades("2","Dr. Horacio Nolasco Martínez","Neonatólogo","8492299","drhoracionolasco@hotmail.com",code,"21.1454079","-86.8445853",
				" Av. La luna num 23 mza 14  SM 43   Pedregal del Bosque. CP. 77500");
		fetch.add(one);
		fetch.add(one1);	
		}
		
		if(code.equals("reuma"))
		{   
			header.setImageDrawable( getResources().getDrawable(R.drawable.header_reumatologo)); 

			//header.setImageDrawable( getResources().getDrawable(R.drawable.reumatologoheader));
		
		
		webView.loadData("<html><head><meta Content-Type: text/html; charset=ISO-8859-1 /></head> "
				+ "<body><div style=text-align:justify>"
				+ "Experto en diagnosticar, tratar y controlar "
				+ "a ni&ntilde;os y adolescentes con enfermedades "
				+ "complejas en articulaciones, m&uacutesculos "
				+ "huesos y &oacute;rganos como ri&ntilde;ones, pulmones, vasos sangu&iacute;neos y cerebro."
				+ " </div></body></html>" ,"text/html", "UTF-8");
		texto.setText("Conoce a nuestros reumatólogos:");
		classespecialidades one = new
				classespecialidades("1","Dr. Omar Ernesto  Rojas Pacheco","Reumatólogo","8981927","dr_rojas_@hotmail.com",code,"21.13655", "-86.827488",
				"Av. Tulum Lote 1 mza 1 consultorio 203  SM 12  Hospital Galenia. CP 77505");
					
		
		fetch.add(one);
		}
		
		if(code.equals("alergo"))
		{   
			//header.setImageDrawable( getResources().getDrawable(R.drawable.alergologoheader));
           
			header.setImageDrawable( getResources().getDrawable(R.drawable.header_alergologo)); 

		webView.loadData("<html><head><meta Content-Type: text/html; charset=ISO-8859-1 /></head> "
				+ "<body><div style=text-align:justify>"
				+ "El alerg&oacute;logo es un m&eacute;dico experto en el diagn&oacute;stico y tratamiento de las alergias, "
				+ "asma y enfermedades relacionadas con el sistema de defensa, por ejemplo rinitis "
				+ "al&eacute;rgica, urticarial y eczema."
				+ " </div></body></html>" ,"text/html", "UTF-8");
		texto.setText("Conoce a nuestros alergólogos:");
		classespecialidades one = new
				classespecialidades("1","Dr. Francisco Navarrete Suárez","Alergólogo","8981927","alergiadecancun@yahoo.com.mx",code,"21.13655", "-86.827488",
				"Av. Tulum Lote 1 mza 1 consultorio 203  SM 12 Hospital Galenia. CP 77505  \n\nServicios: Pacientes con alergias, pruebas de alergia, espirometrias, vacunas para alergia y vacunas complementarias de la cartilla de vacunacion.");
					
		classespecialidades one1 = new 
				classespecialidades("2","Dra. Aurora Meza Morales","Alergólogo","8981927","alergiaypediatria@yahoo.com.mx",code,"21.13655", "-86.827488",
				"Av. Tulum lote 1 mza 1 consultorio 203 SM 12  Hospital Galenia. CP 77505");
		fetch.add(one);
		fetch.add(one1);	
		}
		
		if(code.equals("odonto"))
		{
			header.setImageDrawable( getResources().getDrawable(R.drawable.header_peidatra)); 

			//header.setImageDrawable( getResources().getDrawable(R.drawable.odontopediatraheader));
			
		
		webView.loadData("<html><head><meta Content-Type: text/html; charset=ISO-8859-1 /></head> "
				+ "<body><div style=text-align:justify>"
				+ "La odontopediatr&iacute;a es la rama de la odontolog&iacute;a "
				+ "encargada de tratar a los ni&ntilde;os o reci&eacute;n nacidos hasta los adolescentes. Tratamiento "
				+ "de caries en dientes temporales o de leche."
				+ " </div></body></html>" ,"text/html", "UTF-8");
		texto.setText("Conoce a nuestros odontopediatras:");
		classespecialidades one = new 
				classespecialidades("5","Dr. Mauricio Peña Párraga","Odontopediatra","8021582","pena@teleton-qroo.org.mx",code,"21.150147", "-86.848776",
				"Av. Nichupte 22  Pabellón Caribe  Local 10 grupo médico integral");
		fetch.add(one);
		}
		
		 
		
		
//	    button.setOnClickListener(new View.OnClickListener() {
//	        public void onClick(View v) {
//	            // Perform action on click   
//	        	
//	        	Intent visitas = new Intent(getApplicationContext(), pediatracirujadodetalle.class);
//	        	visitas.putExtra("code", code);
//				startActivity(visitas);
//				finish();
//	        	
//	          
//	        }
//	    });
//	    
	    
//	    buttonregresar.setOnClickListener(new View.OnClickListener() {
//	        public void onClick(View v) {
//	            // Perform action on click   
//	        	
//	        	Intent visitas = new Intent(getApplicationContext(), listamedicogeneral.class);
//				startActivity(visitas);
//				finish();
//	        	
//	          
//	        }
//	    });
	    
	    
		
	    adapter = new adapterdirectorio(pediatracirujano.this, R.id.listView2,
				fetch);
		ListViewopction.setAdapter(adapter);
	
	
	
		ListViewopction.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> a, View v, int position,
					long id) {

				// Alternativa 1:
			/*	String opcionSeleccionada = ((classespecialidades) a.getAdapter()
						.getItem(position)).getId();
				
				Toast.makeText(getApplicationContext(), opcionSeleccionada,Toast.LENGTH_SHORT).show();
				if(opcionSeleccionada.equals("5"))
				{
					
				
					Intent homepage = new Intent(getApplicationContext(),
							fichadoctor.class);
				       startActivity(homepage);
				       finish();
					
				}*/
				
				

			}
		});
		
//		buttonregresar.setOnClickListener(new View.OnClickListener() {
//	        public void onClick(View v) {
//	            // Perform action on click   
//	        	
//	        	Intent visitas = new Intent(getApplicationContext(), pediatracirujano.class);
//	        	visitas.putExtra("code", code);
//				startActivity(visitas);
//				finish();
//	        	
//	          
//	        }
//	    });

	      
		
		
		
			
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