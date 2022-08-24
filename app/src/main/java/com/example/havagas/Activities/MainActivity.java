package com.example.havagas.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.havagas.R;
import com.example.havagas.Usuario;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private EditText nomeEt;
    private EditText emailEt;
    private CheckBox receberEmailCb;
    private RadioButton residencialRb;
    private EditText telefoneEt;
    private CheckBox celularCb;
    private EditText celularEt;
    private RadioButton masculinoRb;
    private EditText dataNascimentoEt;
    private Spinner formacaoSp;
    private LinearLayout fundamentalLl;
    private EditText fundamentalFormaturaEt;
    private LinearLayout medioLl;
    private EditText medioAnoformaturaEt;
    private LinearLayout graduacaoLl;
    private EditText graduacaoConclusaoEt;
    private EditText graduacaoInstituicaoEt;
    private LinearLayout doutoradoLl;
    private EditText doutoradoConclusaoEt;
    private EditText doutoradoInstituicaoEt;
    private EditText doutoradoMonografiaEt;
    private EditText doutoradoOrientadorEt;
    private EditText vagasEt;

    private ArrayList<String> formacaoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();

        exibeSpinnerAndLinearLayouts();

    }

    public void onClick(View view){
        if(view.getId() == R.id.salvarBt){

            Usuario usuario = convertAndSave();
            String exibeUsuario = exibeNotNull(usuario);
            Toast.makeText(this, exibeUsuario, Toast.LENGTH_LONG).show();
        }
        else{

            limpar();
        }
    }

    public void bindViews(){
        nomeEt = findViewById(R.id.nomeEt);
        emailEt = findViewById(R.id.emailEt);
        receberEmailCb = findViewById(R.id.receberEmailCb);
        residencialRb = findViewById(R.id.residencialRb);
        telefoneEt = findViewById(R.id.telefoneEt);
        celularCb = findViewById(R.id.celularCb);
        celularEt = findViewById(R.id.celularEt);
        masculinoRb = findViewById(R.id.masculinoRb);
        dataNascimentoEt = findViewById(R.id.dataNascimentoEt);
        formacaoSp = findViewById(R.id.formacaoSp);
        fundamentalLl = findViewById(R.id.fundamentalLl);
        fundamentalFormaturaEt = findViewById(R.id.fundamentalFormaturaEt);
        medioLl = findViewById(R.id.medioLl);
        medioAnoformaturaEt = findViewById(R.id.medioFormaturaEt);
        graduacaoLl = findViewById(R.id.graduacaoLl);
        graduacaoConclusaoEt = findViewById(R.id.graduacaoConclusaoEt);
        graduacaoInstituicaoEt = findViewById(R.id.graduacaoInstituicaoEt);
        doutoradoLl = findViewById(R.id.doutoradoLl);
        doutoradoConclusaoEt = findViewById(R.id.doutoradoConclusaoEt);
        doutoradoInstituicaoEt = findViewById(R.id.doutoradoInstituicaoEt);
        doutoradoMonografiaEt = findViewById(R.id.doutoradoMonografiaEt);
        doutoradoOrientadorEt = findViewById(R.id.doutoradoOrientadorEt);
        vagasEt = findViewById(R.id.vagasEt);
    }

    public void limpar(){
        nomeEt.setText("");
        emailEt.setText("");
        receberEmailCb.setChecked(false);
        residencialRb.setChecked(true);
        telefoneEt.setText("");
        celularCb.setChecked(false);
        celularEt.setText("");
        masculinoRb.setChecked(true);
        dataNascimentoEt.setText("");
        formacaoSp.setSelection(0);
        fundamentalFormaturaEt.setText("");
        medioAnoformaturaEt.setText("");
        graduacaoConclusaoEt.setText("");
        graduacaoInstituicaoEt.setText("");
        doutoradoConclusaoEt.setText("");
        doutoradoInstituicaoEt.setText("");
        doutoradoMonografiaEt.setText("");
        doutoradoOrientadorEt.setText("");
        vagasEt.setText("");
    }

    public Usuario convertAndSave() {

        String nome = nomeEt.getText().toString();
        String email = emailEt.getText().toString();
        Boolean receberEmail = receberEmailCb.isChecked();
        String tipoTelefone = residencialRb.isChecked() ? "residencial" : "comercial";
        String telefone = telefoneEt.getText().toString();
        String celular = celularEt.getText().toString();
        String sexo = masculinoRb.isChecked() ? "masculino" : "feminino";
        String dataNascimento = dataNascimentoEt.getText().toString();
        String formacao = formacaoSp.getSelectedItem().toString();
        String fundamentalAnoFormatura = fundamentalFormaturaEt.getText().toString();
        String medioAnoformatura = medioAnoformaturaEt.getText().toString();
        String graduacaoConclusao = graduacaoConclusaoEt.getText().toString();
        String graduacaoInstituicao = graduacaoInstituicaoEt.getText().toString();
        String doutoradoConclusao = doutoradoConclusaoEt.getText().toString();
        String doutoradoInstituicao = doutoradoInstituicaoEt.getText().toString();
        String doutoradoMonografia = doutoradoMonografiaEt.getText().toString();
        String doutoradoOrientador = doutoradoOrientadorEt.getText().toString();
        String vagas = vagasEt.getText().toString();

        return new Usuario(nome, email, receberEmail, tipoTelefone, telefone, celular, sexo, dataNascimento, formacao, fundamentalAnoFormatura,
                medioAnoformatura, graduacaoConclusao, graduacaoInstituicao, doutoradoConclusao, doutoradoInstituicao,
                doutoradoMonografia, doutoradoOrientador, vagas);
    }

    public String exibeNotNull(Usuario usuario){
        StringBuilder exibeUser = new StringBuilder();
        Class<? extends Usuario> classe = usuario.getClass();
        Field[] fields = classe.getDeclaredFields();

        for (Field field : fields) {
            Object name = null;
            Object value = null;
            field.setAccessible(true);
            try {
                name = field.getName();
                value = field.get(usuario);
            }catch (IllegalAccessException e){
                e.printStackTrace();
            }

            if (value != null && !value.equals("")) exibeUser.append(name + ": " + value + "\n");

        }

        return exibeUser.toString();
    }

    public void exibeSpinnerAndLinearLayouts(){
        formacaoList = new ArrayList<>(Arrays.asList(getResources().getStringArray((R.array.formacao))));

        ArrayAdapter<String> formacaoAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, formacaoList);
        formacaoSp.setAdapter(formacaoAdapter);

        formacaoSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int posicao, long id) {
                switch (formacaoList.get(posicao)) {
                    case "fundamental":
                        fundamentalLl.setVisibility(View.VISIBLE);
                        medioLl.setVisibility(View.GONE);
                        medioAnoformaturaEt.setText("");
                        graduacaoLl.setVisibility(View.GONE);
                        graduacaoConclusaoEt.setText("");
                        graduacaoInstituicaoEt.setText("");
                        doutoradoLl.setVisibility(View.GONE);
                        doutoradoConclusaoEt.setText("");
                        doutoradoInstituicaoEt.setText("");
                        doutoradoMonografiaEt.setText("");
                        doutoradoOrientadorEt.setText("");
                        break;
                    case "medio":
                        fundamentalLl.setVisibility(View.VISIBLE);
                        medioLl.setVisibility(View.VISIBLE);
                        graduacaoLl.setVisibility(View.GONE);
                        graduacaoConclusaoEt.setText("");
                        graduacaoInstituicaoEt.setText("");
                        doutoradoLl.setVisibility(View.GONE);
                        doutoradoConclusaoEt.setText("");
                        doutoradoInstituicaoEt.setText("");
                        doutoradoMonografiaEt.setText("");
                        doutoradoOrientadorEt.setText("");
                        break;
                    case "graduacao":
                        fundamentalLl.setVisibility(View.VISIBLE);
                        medioLl.setVisibility(View.VISIBLE);
                        graduacaoLl.setVisibility(View.VISIBLE);
                        doutoradoLl.setVisibility(View.GONE);
                        doutoradoConclusaoEt.setText("");
                        doutoradoInstituicaoEt.setText("");
                        doutoradoMonografiaEt.setText("");
                        doutoradoOrientadorEt.setText("");
                        break;
                    default:
                        fundamentalLl.setVisibility(View.VISIBLE);
                        medioLl.setVisibility(View.VISIBLE);
                        graduacaoLl.setVisibility(View.VISIBLE);
                        doutoradoLl.setVisibility(View.VISIBLE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        celularCb.setOnCheckedChangeListener((compoundButton, b) -> {
            if(celularCb.isChecked()) {
                celularEt.setVisibility(View.VISIBLE);
            }
            else{
                celularEt.setVisibility(View.GONE);
                celularEt.setText("");
            }
        });
    }

}