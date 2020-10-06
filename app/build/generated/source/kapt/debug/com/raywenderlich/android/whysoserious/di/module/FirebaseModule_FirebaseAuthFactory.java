// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.raywenderlich.android.whysoserious.di.module;

import com.google.firebase.auth.FirebaseAuth;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class FirebaseModule_FirebaseAuthFactory implements Factory<FirebaseAuth> {
  private final FirebaseModule module;

  public FirebaseModule_FirebaseAuthFactory(FirebaseModule module) {
    this.module = module;
  }

  @Override
  public FirebaseAuth get() {
    return Preconditions.checkNotNull(
        module.firebaseAuth(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<FirebaseAuth> create(FirebaseModule module) {
    return new FirebaseModule_FirebaseAuthFactory(module);
  }
}
