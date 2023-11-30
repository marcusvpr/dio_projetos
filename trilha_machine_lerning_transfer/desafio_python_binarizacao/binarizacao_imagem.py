# -*- coding: utf-8 -*-
from PIL import Image

def converter_para_cinza(imagem):
    largura, altura = imagem.size
    imagem_cinza = Image.new("L", (largura, altura))

    for x in range(largura):
        for y in range(altura):
            pixel = imagem.getpixel((x, y))
            cinza = int((pixel[0] + pixel[1] + pixel[2]) / 3)
            imagem_cinza.putpixel((x, y), cinza)

    return imagem_cinza

def binarizar_imagem(imagem_cinza, limiar):
    largura, altura = imagem_cinza.size
    imagem_binarizada = Image.new("L", (largura, altura))

    for x in range(largura):
        for y in range(altura):
            pixel = imagem_cinza.getpixel((x, y))
            if pixel >= limiar:
                imagem_binarizada.putpixel((x, y), 255)
            else:
                imagem_binarizada.putpixel((x, y), 0)

    return imagem_binarizada

# Carregando a imagem
imagem_colorida = Image.open("lena_colorida.png")

# Convertendo para níveis de cinza
imagem_cinza = converter_para_cinza(imagem_colorida)

# Binarizando a imagem com um limiar de 128
imagem_binarizada = binarizar_imagem(imagem_cinza, 128)

# Salvando a imagem binarizada
imagem_binarizada.save("lena_binarizada.jpg")
