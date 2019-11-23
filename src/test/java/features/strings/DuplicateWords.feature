#language: pt
Funcionalidade: Duplicate words

  Esquema do Cenario: Remove duplicate words
    Dado que digite "<FraseDuplicada>" e removo as palavras duplicadas entao vejo a frase "<FraseCorrigida>"

    Exemplos:
      | FraseDuplicada                                 | FraseCorrigida                      |
      | Goodbye bye bye world world world              | Goodbye bye world                   |
      | Sam went went to to to his business            | Sam went to his business            |
      | Reya is is the the best player in eye eye game | Reya is the best player in eye game |
      | in inthe                                       | in inthe                            |
      | Hello hello Ab aB                              | Hello Ab                            |




