import 'package:firebase_auth/firebase_auth.dart';
import 'package:flutter/material.dart';

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  void _signOut() {
    FirebaseAuth.instance.signOut();
  }

  @override
  Widget build(BuildContext context) {
    final user = FirebaseAuth.instance.currentUser;
    return Scaffold(
      appBar: AppBar(
        title: const Text("Home Page"),
        actions: [
          IconButton(onPressed: _signOut, icon: const Icon(Icons.logout))
        ],
      ),
      body: Center(
        child: Text("Welcome, ${user?.email ?? 'Fashionista'}!"),
      ),
    );
  }
}