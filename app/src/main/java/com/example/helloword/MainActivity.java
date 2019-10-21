package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int[] Images={R.drawable.ex,R.drawable.ou,R.drawable.po,R.drawable.word};

String[] t1={"Excel","Outlook","Power Point","Word"};

String[] t2={"Tableur","Client de courire Electronique","Logiceil presentation","Editure de Text"};

String[] msg={"Votre choix : Excel","Votre choix : Outlook",
        "Votre choix : Power Point","Votre choix : Word"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv=(ListView)findViewById(R.id.list);
lit li=new lit();
lv.setAdapter(li);

lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setTitle("selection item");



        alertDialogBuilder.setMessage(msg[position]);
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("ok", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface arg0, int arg1) {

            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
});









}


    protected class lit extends BaseAdapter{

        @Override
        public int getCount() {
            return Images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            convertView=getLayoutInflater().inflate(R.layout.listview,null);
            ImageView img=(ImageView)convertView.findViewById(R.id.imageView3);
            TextView tt1=(TextView)convertView.findViewById(R.id.textView3);
            TextView tt2 =(TextView)convertView.findViewById(R.id.textView4);
            img.setImageResource(Images[position]);
            tt1.setText(t1[position]);
            tt2.setText(t2[position]);
            return convertView;
        }
    }
}
