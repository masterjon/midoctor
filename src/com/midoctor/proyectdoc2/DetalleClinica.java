package com.midoctor.proyectdoc2;
import java.util.ArrayList;


import com.midoctor.proyectdoc2.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class DetalleClinica extends Activity {
	
	private  ImageView   header;
	 private ImageView hImageViewPic , logo;
	    private Button iButton, gButton;
	    private ImageButton telButton,bottonemail,bottonubicacion;
	    private TextView texttitulo;
	    private TextView  textwebsite;
	    private TextView   texttelefono;
	    private TextView  textemail;
	    String id;
	    String nombre;
	    String website;
	    String direccion ;
	    String  correo ;
	    String  telefono;
	    String  code;
	    private int currentImage = 0;
	    ArrayList<Integer> imgs = new ArrayList<Integer>();
	   
	    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detalle_clinica);
		
		 id = this.getIntent().getStringExtra("id");
		 nombre = this.getIntent().getStringExtra("Nombre");
	     website = this.getIntent().getStringExtra("website");
	     

	     direccion = this.getIntent().getStringExtra("direccion");
	     correo = this.getIntent().getStringExtra("correo");
	     telefono = this.getIntent().getStringExtra("telefono");
	     code = this.getIntent().getStringExtra("code");

	     
	     header = (ImageView) findViewById(R.id.tv_header);
		  hImageViewPic = (ImageView) findViewById(R.id.imageViewrisa);
		
		  iButton = (Button) findViewById(R.id.navegacionder1);
	      gButton = (Button) findViewById(R.id.navegacionizq1);
	      telButton = (ImageButton) findViewById(R.id.bottontel);
	      bottonemail = (ImageButton) findViewById(R.id.bottonemail);
	      bottonubicacion = (ImageButton) findViewById(R.id.bottonubicacion);
	      
	     texttitulo = (TextView)findViewById(R.id.texttitulo);
	     textwebsite = (TextView)findViewById(R.id.website);
	     /*  textdireccion = (TextView)findViewById(R.id.direccion);
	      texttelefono = (TextView)findViewById(R.id.telefono);
	      textemail = (TextView)findViewById(R.id.email);
	      
	      textdireccion.setText(direccion);
	      texttelefono.setText(correo);
	      textemail.setText(telefono);*/
	        texttitulo.setText(nombre);
	       textwebsite.setText(website);
	       
	       telButton.setOnClickListener(call);
	       bottonemail.setOnClickListener(sendMail);
	       bottonubicacion.setOnClickListener(getLocation); 
	       textwebsite.setOnClickListener(openWebsite);
	         
		  if (id.equals("999999"))
		  {
			 
			  hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.francisco1));
			  //iButton.setOnClickListener(iButtonChangeImageListener);
		      //gButton.setOnClickListener(gButtonChangeImageListener);
		  }
		  else
		  {
			 
			  hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.risa)); 
			  
				
				
				
				 if(nombre.equals("Pediatric Center"))
				{
					//header.setImageDrawable( getResources().getDrawable(R.drawable.header_peidatra));
					imgs.add(R.drawable.pediatric_1);
					imgs.add(R.drawable.pediatric_2);
					imgs.add(R.drawable.pediatric_3);
					hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.pediatric_1));
					iButton.setOnClickListener(iButtonChangeImageListener);
				    gButton.setOnClickListener(gButtonChangeImageListener);
				}
				
				else{
					
				}
				
			  
			  
		  }
		
		 
		   
		   
	        
	        // Just set one Click listener for the image

	       
		
		
	
		
		
		
			
	}
	
	
	View.OnClickListener call = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			 Intent intent = new Intent(Intent.ACTION_DIAL);
				intent.setData(Uri.parse("tel:" + telefono));
				startActivity(intent);
			
		}
	};
	
	View.OnClickListener sendMail = new OnClickListener() {

		   @Override
		   public void onClick(View v) {
		    // TODO Auto-generated method stub
			   String to = correo ;
				  String subject = "";
				  String message ="";
				  Intent email = new Intent(Intent.ACTION_SEND);
				  email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
				  //email.putExtra(Intent.EXTRA_CC, new String[]{ to});
				  //email.putExtra(Intent.EXTRA_BCC, new String[]{to});
				  email.putExtra(Intent.EXTRA_SUBJECT, subject);
				  email.putExtra(Intent.EXTRA_TEXT, message);

				  //need this to prompts email client only
				  email.setType("message/rfc822");

				  startActivity(Intent.createChooser(email, "Seleccione un correo:"));
			  
		   }
	};
	
	View.OnClickListener getLocation = new OnClickListener() {
		 @Override
		   public void onClick(View v) {
			   
			   Intent map = new Intent(v.getContext(), mapActivity.class);
			   map.putExtra("code", code);
			   map.putExtra("nombre", nombre);
			   String[] coords = direccion.split(",");
			   map.putExtra("coordenadasla", coords[0]);
			   map.putExtra("coordenadaslo", coords[1]);
			   //map.putExtra("direccion", so.Direccion());
	        	startActivity(map);
	        	
	        	((Activity)v.getContext()).finish();
			 
			
		   }
	};
	View.OnClickListener openWebsite = new OnClickListener() {
		 @Override
		   public void onClick(View v) {
			   
			   Intent websiteIntent = new Intent(Intent.ACTION_VIEW);
			   website = "http://"+website;
			   websiteIntent.setData(Uri.parse(website));
			   
			   //map.putExtra("direccion", so.Direccion());
	        	startActivity(websiteIntent);
	        	
	        	((Activity)v.getContext()).finish();
			 
			
		   }
	};
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
	          
			     
			    	 Intent a1_intent = new Intent(this, ClinicasActivity.class);
			       startActivity(a1_intent);
			           finish();
			           return true;
			     
	      
	      }
	      return false;
	 }

    
}
