def acuracia(matriz_confusao):
  """
  Calcula a acurácia de um modelo de classificação.

  Args:
    matriz_confusao: Matriz de confusão do modelo.

  Returns:
    Acurácia do modelo.
  """

  vp = matriz_confusao[0][0]
  fn = matriz_confusao[0][1]
  vn = matriz_confusao[1][0]
  fp = matriz_confusao[1][1]

  return (vp + vn) / (vp + fn + vn + fp)


def sensibilidade(matriz_confusao):
  """
  Calcula a sensibilidade de um modelo de classificação.

  Args:
    matriz_confusao: Matriz de confusão do modelo.

  Returns:
    Sensibilidade do modelo.
  """

  vp = matriz_confusao[0][0]
  fn = matriz_confusao[0][1]

  return vp / (vp + fn)


def especificidade(matriz_confusao):
  """
  Calcula a especificidade de um modelo de classificação.

  Args:
    matriz_confusao: Matriz de confusão do modelo.

  Returns:
    Especificidade do modelo.
  """

  vn = matriz_confusao[1][0]
  fp = matriz_confusao[1][1]

  return vn / (vn + fp)


def precisao(matriz_confusao):
  """
  Calcula a precisão de um modelo de classificação.

  Args:
    matriz_confusao: Matriz de confusão do modelo.

  Returns:
    Precisão do modelo.
  """

  vp = matriz_confusao[0][0]
  fp = matriz_confusao[1][0]

  return vp / (vp + fp)


def f_score(matriz_confusao):
  """
  Calcula o F-score de um modelo de classificação.

  Args:
    matriz_confusao: Matriz de confusão do modelo.

  Returns:
    F-score do modelo.
  """

  vp = matriz_confusao[0][0]
  fn = matriz_confusao[0][1]
  vn = matriz_confusao[1][0]
  fp = matriz_confusao[1][1]

  p = precisao(matriz_confusao)
  r = sensibilidade(matriz_confusao)

  return 2 * (p * r) / (p + r)
