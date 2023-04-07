
# Stickers para Whatsapp 
Projeto backend desenvolvido durante a semana Imersão Java oferecida pela Alura.

## 👩‍💻 Linguagem e Frameworks utilizados
* JAVA 17
* Spring
* MongoDb
* RegEx
* JSON

## 🕹️ Visão Geral
Durante essa Imersão, tivemos como objetivo consumir APIs para criação de figurinhas que possam ser utilizadas no Whatsapp, além de criar nossa própria API hospedada em um banco de dados gratuito.

## 📚 Metodologias Utilizadas
### Java
* Conexão HTTP
* Utilização de RegEx na API para retornar os dados JSON.
* Criação de um novo diretório para armazenar as figurinhas geradas
* Configuração de Variáveis de Ambiente
* Refatoração de código
  * Boas práticas e alta coesão
  * Acoplamento entre classes
  * Interfaces
  * Record
  * Abstract
* POO
  * Herança
  * Encapsulamento
  * Polimorfismo
  * Construtores
* Manipulação de imagens
  * Explorando as bibliotecas ImageIo, InputStream, BufferedImage e outras
  * Redimensionando as imagens contidas nas APIs
  * Adicionando frases nas figurinhas  
  * Adicionando bordas na frase em destaque

# ✅ Resultados
## <p>Aqui encontra-se alguns exemplos das figurinhas geradas</p>
![Result](https://user-images.githubusercontent.com/115672410/230679778-dc8d5e18-e614-467e-8c89-7b265e3ed66c.jpeg)


# ⚠️ Observações
* O programa irá criar automaticamente o diretório /stickerswhatsapp. Caso já exista, não será criado um novo diretório.
* As URLs das APIs estão guardadas em variáveis de ambiente.
* Na classe StickerAPI, as linhas 14 e 15 se referem a API do IMDB, enquanto as linhas 18 e 19 se referem a API da NASA. Para utilizar a API do IMDB, basta comentar o bloco de linhas referente a da NASA, e vice-versa.
* É possível alterar o texto das figurinhas na linha 37 da classe StickerGenerator.
