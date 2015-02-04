package com.midoctor.proyectdoc2;
import java.util.ArrayList;

import com.midoctor.proyectdoc2.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class fichadoctor extends Activity {
	
	private  ImageView   header;
	 private ImageView hImageViewPic , logo;
	    private Button iButton, gButton;
	    private TextView texttitulo;
	    private TextView  textdireccion;
	    private TextView   texttelefono;
	    private TextView  textemail;
	    String id;
	    String nombre;
	    String especialidad;
	    String direccion ;
	    String  correo ;
	    String  telefono;
	    String  code;
	    private int currentImage = 0;
	    ArrayList<Integer> imgs = new ArrayList<Integer>();
	   
	    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fichadoctor);
		
		 id = this.getIntent().getStringExtra("id");
		 nombre = this.getIntent().getStringExtra("Nombre");
	     especialidad = this.getIntent().getStringExtra("especialidad");
	     direccion = this.getIntent().getStringExtra("direccion");
	     correo = this.getIntent().getStringExtra("correo");
	     telefono = this.getIntent().getStringExtra("telefono");
	     code = this.getIntent().getStringExtra("code");
	     
	     header = (ImageView) findViewById(R.id.tv_header);
		  hImageViewPic = (ImageView) findViewById(R.id.imageViewrisa);
		
		  iButton = (Button) findViewById(R.id.navegacionder1);
	      gButton = (Button) findViewById(R.id.navegacionizq1);
	      texttitulo = (TextView)findViewById(R.id.texttitulo);
	      textdireccion = (TextView)findViewById(R.id.direccion);
	      texttelefono = (TextView)findViewById(R.id.telefono);
	      textemail = (TextView)findViewById(R.id.email);
	      
	      textdireccion.setText(direccion);
	      texttelefono.setText(correo);
	      textemail.setText(telefono);
	        texttitulo.setText(nombre);
	        
	        
	        
	         
		  if (id.equals("999999"))
		  {
			 
			  hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.francisco1));
			  //iButton.setOnClickListener(iButtonChangeImageListener);
		      //gButton.setOnClickListener(gButtonChangeImageListener);
		  }
		  else
		  {
			 
			  hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.risa)); 
			  
				
				if(nombre.equals("Dra. Eunice May Narvaez"))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_peidatra));
					  hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.logo_eunice_may_big));
					 iButton.setVisibility(View.GONE);
					  gButton.setVisibility(View.GONE);
				}
				else if(nombre.equals("Dr. José Carlos Balmaceda L."))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_peidatra));
					 iButton.setVisibility(View.GONE);
					  gButton.setVisibility(View.GONE);
				}
				else if(nombre.equals("Dr. Raúl Medina Chávez"))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_peidatra));
					imgs.add(R.drawable.doctor_bg);
					imgs.add(R.drawable.mascota_bg_general);
					hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.doctor_bg	));
					iButton.setOnClickListener(iButtonChangeImageListener);
				    gButton.setOnClickListener(gButtonChangeImageListener);
				}
				else if(nombre.equals("Dra. Genny Santamaría Berrón"))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_peidatra));
					imgs.add(R.drawable.logo_geny_big);
					imgs.add(R.drawable.seccion_geny);
					hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.logo_geny_big));
					iButton.setOnClickListener(iButtonChangeImageListener);
				    gButton.setOnClickListener(gButtonChangeImageListener);
				}
				else if(nombre.equals("Dra. Miriam Campos Rebolledo"))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_neonatologo));
					 iButton.setVisibility(View.GONE);
					  gButton.setVisibility(View.GONE);
				}
				else if(nombre.equals("Dr. Horacio Nolasco Martínez"))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_neonatologo));
					 iButton.setVisibility(View.GONE);
					  gButton.setVisibility(View.GONE);
				}
				else if(nombre.equals("Dr. Omar Ernesto  Rojas Pacheco"))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_reumatologo));
					imgs.add(R.drawable.logo_omar_ernesto_rojas_big);
					imgs.add(R.drawable.mascota_bg_reumatologo);
					hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.logo_omar_ernesto_rojas_big));
					iButton.setOnClickListener(iButtonChangeImageListener);
				    gButton.setOnClickListener(gButtonChangeImageListener);
				}
				else if(nombre.equals("Dr. Francisco Navarrete Suárez"))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_alergologo));
					imgs.add(R.drawable.logo_navarrete_big);
					imgs.add(R.drawable.navarrete1);
					imgs.add(R.drawable.navarrete2);
					imgs.add(R.drawable.navarrete3);
					imgs.add(R.drawable.mascota_bg_alergologo);
					
					hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.logo_navarrete_big));
					iButton.setOnClickListener(iButtonChangeImageListener);
				    gButton.setOnClickListener(gButtonChangeImageListener);
				}
				else if(nombre.equals("Dra. Aurora Meza Morales"))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_alergologo));
					imgs.add(R.drawable.logo_aurora_big);
					imgs.add(R.drawable.risa);
					imgs.add(R.drawable.mascota_bg_alergologo);
					hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.logo_aurora_big));
					iButton.setOnClickListener(iButtonChangeImageListener);
				    gButton.setOnClickListener(gButtonChangeImageListener);
				}
				else if(nombre.equals("Dr. Mauricio Peña Párraga"))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_peidatra));
					hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.logo_mauricio_axayacatl_big));
					 iButton.setVisibility(View.GONE);
					  gButton.setVisibility(View.GONE);
				}
				else if(nombre.equals("Dr. Raúl Barragán Parrao"))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_gastroenterologo));
					hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.logo_raul_big));
					 iButton.setVisibility(View.GONE);
					  gButton.setVisibility(View.GONE);
				}
				else{
					
				}
				
			  
			  
		  }
		
		 
		   
		   
	        
	        // Just set one Click listener for the image

	       
		
		
	
		
		
		
			
	}
	
	 View.OnClickListener iButtonChangeImageListener = new OnClickListener() {

         public void onClick(View v) {
             try {
                 // Increase Counter to move to next Image
                 currentImage++;

                 currentImage = currentImage % imgs.size();

                 hImageViewPic.setImageResource(imgs.get(currentImage));

               
             } catch (Exception e) {

             }

         }

     };

     View.OnClickListener gButtonChangeImageListener = new OnClickListener() {

         public void onClick(View v) {
             try {
                 // Decrease Counter to move to previous Image
                 currentImage--;

                 currentImage = (currentImage + imgs.size()) % imgs.size();

                 hImageViewPic.setImageResource(imgs.get(currentImage));

                 

             } catch (Exception e) {

             }
         }
     };

     protected void onPause() {
         // TODO Auto-generated method stub
         super.onPause();
         
         //finish();
     }
	
     @Override
	 public boolean onKeyUp(int keyCode, KeyEvent msg) {

	      switch(keyCode) {
	      case(KeyEvent.KEYCODE_BACK):
	          
			     if(code.equals("gastro")){
			    	 Intent a1_intent = new Intent(this, ListaMedicosActivity.class);
				     a1_intent.putExtra("especialidad", code);
			       startActivity(a1_intent);
			           finish();
			           return true;
			    	
			     }
			     else{
			    	 Intent a1_intent = new Intent(this, pediatracirujano.class);
				     a1_intent.putExtra("code", code);
			       startActivity(a1_intent);
			           finish();
			           return true;
			     }
	      
	      }
	      return false;
	 }

    
}