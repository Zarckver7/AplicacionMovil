// Generated by view binder compiler. Do not edit!
package com.example.aurumverus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.aurumverus.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegistroClienteBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final MaterialButton btnRegistrarC;

  @NonNull
  public final EditText edtxConContraseAC;

  @NonNull
  public final EditText edtxContraseAC;

  @NonNull
  public final EditText edtxCorreoC;

  @NonNull
  public final EditText edtxNombreC;

  @NonNull
  public final ScrollView main;

  private ActivityRegistroClienteBinding(@NonNull ScrollView rootView,
      @NonNull MaterialButton btnRegistrarC, @NonNull EditText edtxConContraseAC,
      @NonNull EditText edtxContraseAC, @NonNull EditText edtxCorreoC,
      @NonNull EditText edtxNombreC, @NonNull ScrollView main) {
    this.rootView = rootView;
    this.btnRegistrarC = btnRegistrarC;
    this.edtxConContraseAC = edtxConContraseAC;
    this.edtxContraseAC = edtxContraseAC;
    this.edtxCorreoC = edtxCorreoC;
    this.edtxNombreC = edtxNombreC;
    this.main = main;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegistroClienteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegistroClienteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_registro_cliente, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegistroClienteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnRegistrarC;
      MaterialButton btnRegistrarC = ViewBindings.findChildViewById(rootView, id);
      if (btnRegistrarC == null) {
        break missingId;
      }

      id = R.id.edtxConContraseñaC;
      EditText edtxConContraseAC = ViewBindings.findChildViewById(rootView, id);
      if (edtxConContraseAC == null) {
        break missingId;
      }

      id = R.id.edtxContraseñaC;
      EditText edtxContraseAC = ViewBindings.findChildViewById(rootView, id);
      if (edtxContraseAC == null) {
        break missingId;
      }

      id = R.id.edtxCorreoC;
      EditText edtxCorreoC = ViewBindings.findChildViewById(rootView, id);
      if (edtxCorreoC == null) {
        break missingId;
      }

      id = R.id.edtxNombreC;
      EditText edtxNombreC = ViewBindings.findChildViewById(rootView, id);
      if (edtxNombreC == null) {
        break missingId;
      }

      ScrollView main = (ScrollView) rootView;

      return new ActivityRegistroClienteBinding((ScrollView) rootView, btnRegistrarC,
          edtxConContraseAC, edtxContraseAC, edtxCorreoC, edtxNombreC, main);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
