package com.midoctor.proyectdoc2;

import java.util.ArrayList;

import com.midoctor.proyectdoc2.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;


public class especalidadades extends Activity {
	
	
	private  ListView ListViewopction;
	
	String[] valuesOPCIONES = new String[] {"Especialidades" ,"Laboratorios", "Rayos X", "Clínicas y Hospitales",
    "Farmacias" }; 
	
	private adapterlistespecilidadades adapter;
	private ArrayList<classespecialidades> fetch = new ArrayList<classespecialidades>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_opcionesmenu);
		
		
		ImageButton doctores = (ImageButton) findViewById(R.id.doctoresOption);
		doctores.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent homepage = new Intent(getApplicationContext(),
						detalleespecialidadades.class);
			       startActivity(homepage);
			       finish();
				// TODO Auto-generated method stub
				
			}
		});
		ImageButton hospitales = (ImageButton) findViewById(R.id.hospitalesOption);
		hospitales.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent homepage = new Intent(getApplicationContext(),
						ClinicasActivity.class);
				homepage.putExtra("background", 1);
				
			       startActivity(homepage);
			       
				// TODO Auto-generated method stub
				
			}
		});
		ImageButton laboratorios = (ImageButton) findViewById(R.id.laboratoriosOption);
		laboratorios.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent homepage = new Intent(getApplicationContext(),
						LaboratoriosActivity.class);
				homepage.putExtra("background", 2);
			       startActivity(homepage);
			       
				// TODO Auto-generated method stub
				
			}
		});
		ListViewopction = (ListView) findViewById(R.id.listView1);
		 
		/* ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
					android.R.layout.simple_list_item_1, valuesOPCIONES);
		 ListViewopction.setAdapter(adapter1);*/
		
		classespecialidades one = new classespecialidades("1","Doctores",null,null,null,null,null,null,null);
		classespecialidades one1 = new classespecialidades("2","Laboratorios",null,null,null,null,null,null,null);
		classespecialidades one2 = new classespecialidades("3","Rayos X",null,null,null,null,null,null,null);
		classespecialidades one3 = new classespecialidades("4","Clínicas y Hospitales",null,null,null,null,null,null,null);
		classespecialidades one4 = new classespecialidades("5","Farmacias",null,null,null,null,null,null,null);
		fetch.add(one);
		fetch.add(one1);
		fetch.add(one2);
		fetch.add(one3);
		fetch.add(one4);
			adapter = new adapterlistespecilidadades(especalidadades.this, R.id.listView1,
					fetch);
			
			
			ListViewopction.setAdapter(adapter);
		 
		 
			ListViewopction.setOnItemClickListener(new OnItemClickListener() {
				public void onItemClick(AdapterView<?> a, View v, int position,
						long id) {

					// Alternativa 1:
					String opcionSeleccionada = ((classespecialidades) a.getAdapter()
							.getItem(position)).getId();
                       
					if(opcionSeleccionada.equals("1"))
					{
						
						Intent homepage = new Intent(getApplicationContext(),
								detalleespecialidadades.class);
					       startActivity(homepage);
					       finish();
						
					}
					

				}
			});
			
			

		
	}
	 @Override
	 public boolean onKeyUp(int keyCode, KeyEvent msg) {

	      switch(keyCode) {
	      case(KeyEvent.KEYCODE_BACK):
	           Intent a1_intent = new Intent(this, MainActivity.class);
	           startActivity(a1_intent);
	           finish();
	           return true; 
	      }
	      return false;
	 }
}