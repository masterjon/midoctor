package com.midoctor.proyectdoc2;

import java.util.ArrayList;

import com.midoctor.proyectdoc2.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;


public class pediatracirujadodetalle extends Activity {
	
	
	private  ListView ListViewopction;
	//private  Button buttonregresar;
	private  ImageView   header;
	private adapterdirectorio adapter;
	private ArrayList<classespecialidades> fetch = new ArrayList<classespecialidades>();
	public static String code;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pediatracirujanodetail);
		
		ListViewopction = (ListView) findViewById(R.id.listView2);
		//buttonregresar = (Button) findViewById(R.id.navegacionizq);
		header = (ImageView) findViewById(R.id.tv_header);
		code = this.getIntent().getStringExtra("code");
		
	
		
		if(code.equals("pediatra"))
		{
			
			header.setImageDrawable( getResources().getDrawable(R.drawable.headerpediatraslista));      
			classespecialidades one = new
		classespecialidades("1","Dra. Eunice May Narvaez","Pediatra","9982250326","nichemn01@hotmail.com","pediatra","21.15869000614639", "-86.85727299999996",
		"Av López portillo num 872 y 874 consultorio 101"+"\n"+"Primer piso SM 59 Quirúrgica del Sur."+"/n"+"Unidad Morelos Cancún Quintana Roo","");
			
			classespecialidades one1 = new classespecialidades("2","Dr. José Carlos Balmaceda L.","Pediatra","9988450668","jocabalo45@hotmail.com","pediatra","21.135900006139135", "-86.82763299999999",
		"Av. Tulum Lote 1 mza 1 consultorio 322 Sm 12 "+"\n"+" Hospital Galenia. cancún Quintana Roo CP 77505","");
			
			classespecialidades one2 = new classespecialidades("3","Dr. Raúl Medina Chávez","Pediatra","848 29 46","raulmedina1956@hotmail.com","pediatra","21.1514541","-86.8414688",
		"Av. Andrés Quintana Roo  157  SM 45 Cancún Quintana Roo","");
			
			classespecialidades one3 = new classespecialidades("4","Dra. Genny Santamaría Berrón","Pediatra","848 29 46","genny_pasitos@hotmail.com","pediatra","21.149954","-86.848554",
		"Av Andrés Quintana Roo num 157 Sm 45" +"\n"+"Pasitos.Cancún Quintana Roo  CP 77500","www.pasitos.mx");
			
			
			fetch.add(one);
			fetch.add(one1);
			fetch.add(one2);
			fetch.add(one3);
			
		
		}
		
		if(code.equals("neonato"))
		{  
			header.setImageDrawable( getResources().getDrawable(R.drawable.neonatologolistaheader)); 
		   //header.setBackgroundDrawable(getResources().getDrawable(R.drawable.neonatologolistaheader));     
			classespecialidades one = new classespecialidades("1","Dr. Horacio Nolasco Martínez","Pediátrica Neonatólogo","9988740600","drhorasiovelasco@hotmail.com","neonato","21.1495508006631", "-86.84110073857727",
		"Av. la Luna num 23 mza 14 SM 43 Cancún Quintana Roo CP 77500","");
			
			classespecialidades one1 = new classespecialidades("2","Dra. Miriam Campos Rebolledo","Neonatóloga","206 35 49","micamre@hotmail.com","neonato","21.1501671","-86.8487121",
	    "Av. Andrés Quinatan Roo mza 1 Consultorio 1 SM45 Edificio Roberth Koch","");
			fetch.add(one);
			fetch.add(one1);
		}
		
		if(code.equals("reuma"))
		{   
			header.setImageDrawable( getResources().getDrawable(R.drawable.reumatologolistaheader));
			//header.setBackgroundDrawable(getResources().getDrawable(R.drawable.reumatologolistaheader));     
			classespecialidades one = new classespecialidades("1","Dr. Omar Enesto Rojas P.","Reomatologia Pediátrica","9982606097","dr_rojas_@hotmail.com","reuma","21.135900006139135","-86.82763299999999",
	   "Av. Tulum Lote 1 mza 1 consultorio 203 SM 12 Hospital Galenia Cancún Quintanan Roo CP 77505","");
			fetch.add(one);
			
			
		}
		
		if(code.equals("alergo"))
		{
			header.setImageDrawable( getResources().getDrawable(R.drawable.alergologolistaheader));
			//header.setBackgroundDrawable(getResources().getDrawable(R.drawable.alergologolistaheader));     
			classespecialidades one = new classespecialidades("5","Dr. Francisco Navarrete Suárez","Medico Pediátra alergólogo","8981927","alergiadecancun@yahoo.com.mx","alergo","21.135900006139135","-86.82763299999999",
	   "Av. Tulum Lote 1 mza 1 consultorio 203  SM 12 Hospital Galenia  Cancún Quintana Roo  CP 77505","");
			classespecialidades one1 = new classespecialidades("2","Dra Aurora Meza Morales","Medico Pediátra alergólogo","898 19 27","alergiaypediatria@yahoo.com.mx","alergo","21.135900006139135", "-86.82763299999999",
	   "Av. Tulum lote 1 mza 1 consultorio 203 SM 12 Hospital Galenia Cancún Quintana Roo  CP 77505","");
			 
			fetch.add(one);
			fetch.add(one1);
			
		}
		
		if(code.equals("odonto"))
		{ 
			header.setImageDrawable( getResources().getDrawable(R.drawable.odontopediatralistaheader));
			//header.setBackgroundDrawable(getResources().getDrawable(R.drawable.odontopediatralistaheader));     
			classespecialidades one = new classespecialidades("1","Dr. Mauricio Axayacatl Peña","Especialistadad en Odontopeditría","9988021582","pena@teleton-qroo.org.mx","odonto","21.1507659","-86.8419013",
	  "Av. Kabah num 42  mza 4 lote 42 SM 44 Cancún Quintana Roo CP 77506","");
			 fetch.add(one);
			
			
		
		}
		
		adapter = new adapterdirectorio(pediatracirujadodetalle.this, R.id.listView2,
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
			
//			buttonregresar.setOnClickListener(new View.OnClickListener() {
//		        public void onClick(View v) {
//		            // Perform action on click   
//		        	
//		        	Intent visitas = new Intent(getApplicationContext(), pediatracirujano.class);
//		        	visitas.putExtra("code", code);
//					startActivity(visitas);
//					finish();
//		        	
//		          
//		        }
//		    });
//			
	      
		
		
		
			
	}
	 @Override
	 public boolean onKeyUp(int keyCode, KeyEvent msg) {

	      switch(keyCode) {
	      case(KeyEvent.KEYCODE_BACK):
	           Intent a1_intent = new Intent(this, pediatracirujano.class);
	           a1_intent.putExtra("code", code);
	           startActivity(a1_intent);
	           finish();
	           return true; 
	      }
	      return false;
	 }
}
	
	