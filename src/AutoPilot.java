/**
 / Classe extendida de Veiculos responsavel por definir pontos de origem, destino e rotas do veiculo
 **/

import java.util.ArrayList;
import java.util.List;

public class AutoPilot extends Veiculos
{
    /// construtor com rota especifica
    public AutoPilot(List <Vertice> menorRota, List <Aresta> origemDestino, String aleatorio)
    {
        if(aleatorio.equals("aleatorio"))
            setIDParaRandom();
        rotaAleatoria = false;
        this.menorRota = menorRota;
        arestaOrigem = origemDestino.get(0);
        arestaDestino = origemDestino.get(1);
        posicionaNaAresta();
        defineCoordenadasDestino();
    }

    /// posiciona o veiculo na aresta
    public void posicionaNaAresta()
    {
        arestaAtual = arestaOrigem;
        super.setQuadranteAtual(arestaOrigem.getQuadrante());

        centraliza(arestaOrigem);

        super.setX(xCentral);
        super.setY(yCentral);
    }

    /// define as coordenadas de destino do veiculo
    public void defineCoordenadasDestino()
    {
        super.setQuadranteDestino(arestaDestino.getQuadrante());

        centraliza(arestaDestino);

        super.xDestino = xCentral;
        super.yDestino = yCentral;
    }

    /// centraliza o veiculo na aresta
    public void centraliza(Aresta aresta)
    {
        int coordenadas[][] = aresta.getCoordenadas();
        String sentido = aresta.getDirecao();
        if(sentido.equals("esquerda"))
        {
            xCentral = coordenadas[0][1] + (aresta.getPeso() / 2 );
            yCentral = coordenadas[1][0];
        }
        else if(sentido.equals("direita"))
        {
            xCentral = coordenadas[0][0] + (aresta.getPeso() / 2 );
            yCentral = coordenadas[1][0];
        }
        else if(sentido.equals("cima"))
        {
            xCentral = coordenadas[0][1];
            yCentral = coordenadas[1][1] + (aresta.getPeso() / 2 );
        }
        else
        {
            xCentral = coordenadas[0][1];
            yCentral = coordenadas[1][0] + (aresta.getPeso() / 2 );
        }
    }

    /// nove o veiculo no mundo de grades
    public void move()
    {
        String direcao = arestaAtual.getDirecao();
        Mundo matrizMundo = new Mundo();
        int quadrante = super.getQuadranteAtual();
        int mundo[][];
        switch (quadrante)
        {
            default:
            {
                mundo = matrizMundo.getMundoQ1();
                break;
            }

            case 2:
            {
                mundo = matrizMundo.getMundoQ2();
                break;
            }

            case 3:
            {
                mundo = matrizMundo.getMundoQ3();
                break;
            }

            case 4:
            {
                mundo = matrizMundo.getMundoQ4();
                break;
            }
        }

        if(!cheguei)
        {
            if(direcao.equals("esquerda"))
            {
                if(mundo[super.getY()][super.getX()] < 10 && super.getX() == 0)
                {
                    cruzandoQuadrante = true;
                    naEsquinaRota();
                }
                else if(mundo[super.getY()][super.getX()] >= 10 && super.getX() == 0)
                {
                    cruzandoQuadrante = true;
                    moveNoVertice();
                }
                else if(mundo[super.getY()][super.getX() - 1] == 6)
                {
                    proxArestaDefinida = false;
                    super.setX(super.getX()-1);
                }
                else
                {
                    naEsquinaRota();
                }
            }
            else if(direcao.equals("direita"))
            {
                if(mundo[super.getY()][super.getX()] < 10 && super.getX() == 59)
                {
                    cruzandoQuadrante = true;
                    naEsquinaRota();
                }
                else if(mundo[super.getY()][super.getX()] >= 10 && super.getX() == 59)
                {
                    cruzandoQuadrante = true;
                    moveNoVertice();
                }
                else if(mundo[super.getY()][super.getX() + 1] == 5)
                {
                    proxArestaDefinida = false;
                    super.setX(super.getX() + 1);

                }
                else
                {
                    naEsquinaRota();
                }
            }
            else if(direcao.equals("cima"))
            {
                if(mundo[super.getY()][super.getX()] < 10 && super.getY() == 0)
                {
                    cruzandoQuadrante = true;
                    naEsquinaRota();
                }
                else if(mundo[super.getY()][super.getX()] >= 10 && super.getY() == 0)
                {
                    cruzandoQuadrante = true;
                    moveNoVertice();
                }
                else if(mundo[super.getY() - 1][super.getX()] == 7)
                {
                    proxArestaDefinida = false;
                    super.setY(super.getY() - 1);
                }
                else
                {
                    naEsquinaRota();
                }
            }
            else
            {
                if(mundo[super.getY()][super.getX()] < 10 && super.getY() == 59)
                {
                    cruzandoQuadrante = true;
                    naEsquinaRota();
                }
                else if(mundo[super.getY()][super.getX()] >= 10 && super.getY() == 59)
                {
                    cruzandoQuadrante = true;
                    moveNoVertice();
                }
                else if(mundo[super.getY() + 1][super.getX()] == 8)
                {
                    proxArestaDefinida = false;
                    super.setY(super.getY() + 1);
                }
                else
                {
                    naEsquinaRota();
                }
            }

            if(super.getX() == super.getxDestino() && super.getY() == super.getyDestino() &&
                    super.getQuadranteAtual() == super.getQuadranteDestino())
            {
                cheguei = true;
            }
        }
    }

    /// calcula a rota do veiculo nas esquinas
    public void naEsquinaRota()
    {
        if(!proxArestaDefinida)
        {
            List <Aresta> buffer = menorRota.get(0).getArestas();
            for(int i=0; i < buffer.size(); i++)
            {
                if(menorRota.size() > 1)
                {
                    Vertice comparador = menorRota.get(1);
                    if(buffer.get(i).getDestino().equals(comparador))
                    {
                        arestaProxima = buffer.get(i);
                        break;
                    }
                }
                else
                {
                    if(buffer.get(i).getDestino().equals(arestaDestino.getDestino()) &&
                            buffer.get(i).getOrigem().equals(arestaDestino.getOrigem()))
                    {
                        arestaProxima = arestaDestino;
                        chegueiNaArestaDestino = true;
                        break;
                    }
                }
            }
            menorRota.remove(0);
            proxArestaDefinida = true;
            rotaParaProximaAresta();
            moveNoVertice();
            arestaAtual = arestaProxima;
        }
        else
        {
            moveNoVertice();
        }
    }

    /// define as direções a serem seguidas em esquinas
    public void rotaParaProximaAresta()
    {
        rotaNosCruzamentos.clear();
        if(arestaAtual.getDirecao().equals("direita"))
        {
            if(arestaProxima.getDirecao().equals("direita"))
            {
                for(int i = 0; i < 7; i++)
                {
                    rotaNosCruzamentos.add("direita");
                }
            }

            else if(arestaProxima.getDirecao().equals("cima"))
            {
                rotaNosCruzamentos.add("direita");
                rotaNosCruzamentos.add("direita");
                rotaNosCruzamentos.add("direita");
                rotaNosCruzamentos.add("direita");
                rotaNosCruzamentos.add("cima");
                rotaNosCruzamentos.add("cima");
                rotaNosCruzamentos.add("cima");
            }
            else if(arestaProxima.getDirecao().equals("baixo"))
            {
                rotaNosCruzamentos.add("direita");
                rotaNosCruzamentos.add("direita");
                rotaNosCruzamentos.add("baixo");
                rotaNosCruzamentos.add("baixo");
            }
        }
        else if(arestaAtual.getDirecao().equals("esquerda"))
        {
            if(arestaProxima.getDirecao().equals("esquerda"))
            {
                for(int i = 0; i < 7; i++)
                {
                    rotaNosCruzamentos.add("esquerda");
                }
            }
            else if(arestaProxima.getDirecao().equals("cima"))
            {
                rotaNosCruzamentos.add("esquerda");
                rotaNosCruzamentos.add("esquerda");
                rotaNosCruzamentos.add("cima");
                rotaNosCruzamentos.add("cima");
            }
            else if(arestaProxima.getDirecao().equals("baixo"))
            {
                rotaNosCruzamentos.add("esquerda");
                rotaNosCruzamentos.add("esquerda");
                rotaNosCruzamentos.add("esquerda");
                rotaNosCruzamentos.add("esquerda");
                rotaNosCruzamentos.add("baixo");
                rotaNosCruzamentos.add("baixo");
                rotaNosCruzamentos.add("baixo");
            }
        }
        else if(arestaAtual.getDirecao().equals("cima"))
        {
            if(arestaProxima.getDirecao().equals("direita"))
            {
                rotaNosCruzamentos.add("cima");
                rotaNosCruzamentos.add("cima");
                rotaNosCruzamentos.add("direita");
                rotaNosCruzamentos.add("direita");
            }
            else if(arestaProxima.getDirecao().equals("esquerda"))
            {
                rotaNosCruzamentos.add("cima");
                rotaNosCruzamentos.add("cima");
                rotaNosCruzamentos.add("cima");
                rotaNosCruzamentos.add("cima");
                rotaNosCruzamentos.add("esquerda");
                rotaNosCruzamentos.add("esquerda");
                rotaNosCruzamentos.add("esquerda");
            }
            else if(arestaProxima.getDirecao().equals("cima"))
            {
                for(int i = 0; i < 7; i++)
                {
                    rotaNosCruzamentos.add("cima");
                }
            }
        }
        else
        {
            if(arestaProxima.getDirecao().equals("direita"))
            {
                rotaNosCruzamentos.add("baixo");
                rotaNosCruzamentos.add("baixo");
                rotaNosCruzamentos.add("baixo");
                rotaNosCruzamentos.add("baixo");
                rotaNosCruzamentos.add("direita");
                rotaNosCruzamentos.add("direita");
                rotaNosCruzamentos.add("direita");

            }
            else if(arestaProxima.getDirecao().equals("esquerda"))
            {
                rotaNosCruzamentos.add("baixo");
                rotaNosCruzamentos.add("baixo");
                rotaNosCruzamentos.add("esquerda");
                rotaNosCruzamentos.add("esquerda");
            }
            else if(arestaProxima.getDirecao().equals("baixo"))
            {
                for(int i = 0; i < 7; i++)
                {
                    rotaNosCruzamentos.add("baixo");
                }
            }
        }
    }

    /// move o veiculo nas esquinas
    public void moveNoVertice()
    {
        if(rotaNosCruzamentos.get(0).equals("direita"))
        {
            rotaNosCruzamentos.remove(0);
            if(cruzandoQuadrante)
            {
                super.setX(0);
                cruzandoQuadrante = false;
                setQuadranteAtual(arestaProxima.getQuadrante());
            }
            else
            {
                if(super.getX() == 59)
                {
                    super.setX(0);

                }
                else
                {
                    super.setX(super.getX() + 1);
                }

            }

        }
        else if(rotaNosCruzamentos.get(0).equals("esquerda"))
        {
            rotaNosCruzamentos.remove(0);
            if(cruzandoQuadrante)
            {
                super.setX(59);
                cruzandoQuadrante = false;
                setQuadranteAtual(arestaProxima.getQuadrante());
            }
            else
            {
                if(super.getX() == 0)
                {
                    super.setX(59);

                }
                else
                    super.setX(super.getX() - 1);
            }
        }

        else if(rotaNosCruzamentos.get(0).equals("cima"))
        {
            rotaNosCruzamentos.remove(0);
            if(cruzandoQuadrante)
            {
                super.setY(59);
                cruzandoQuadrante = false;
                setQuadranteAtual(arestaProxima.getQuadrante());
            }
            else
            {
                if(super.getY() == 0)
                {
                    super.setY(59);

                }
                else
                    super.setY(super.getY() - 1);
            }

        }
        else
        {
            rotaNosCruzamentos.remove(0);
            if(cruzandoQuadrante)
            {
                super.setY(0);
                cruzandoQuadrante = false;
                setQuadranteAtual(arestaProxima.getQuadrante());
            }
            else
            {
                if(super.getY() == 59)
                {
                    super.setY(0);

                }
                else
                    super.setY(super.getY() + 1);
            }
        }
    }

    /// gera as coordenadas a serem seguidas na Interface Gráfica
    public void gerarCoordenadasGUI()
    {
        caminhosGUI = new ArrayList<>();

        while ((getX() != getxDestino() || getY() != getyDestino()) || super.getQuadranteAtual() != super.getQuadranteDestino())
        {
            System.out.printf("X atual e Y atual: ");
            System.out.print(getX() + " " + getY() + "\n");
            System.out.printf("X final e Y final: ");
            System.out.print(getxDestino() + " " + getyDestino() + "\n");
            System.out.printf("Quadrante atual: ");
            System.out.print(getQuadranteAtual() + "\n");
            System.out.printf("Quadrante final: ");
            System.out.print(getQuadranteDestino() + "\n\n");

            List<Integer> bufferXeY = new ArrayList<>();

            if(getQuadranteAtual() == 4)
            {
                bufferXeY.add(getX() + 60);
                bufferXeY.add(getY() + 60);
            }
            else if(getQuadranteAtual() == 3)
            {
                bufferXeY.add(getX());
                bufferXeY.add(getY() + 60);
            }
            else if(getQuadranteAtual() == 2)
            {
                bufferXeY.add(getX() + 60);
                bufferXeY.add(getY());
            }
            else
            {
                bufferXeY.add(getX());
                bufferXeY.add(getY());
            }

            caminhosGUI.add(bufferXeY);

            move();
        }

        System.out.printf("X atual e Y atual: ");
        System.out.print(getX() + " " + getY() + "\n");
        System.out.printf("X final e Y final: ");
        System.out.print(getxDestino() + " " + getyDestino() + "\n");
        System.out.printf("Quadrante atual: ");
        System.out.print(getQuadranteAtual() + "\n");
        System.out.printf("Quadrante final: ");
        System.out.print(getQuadranteDestino() + "\n\n");
    }

    /// gera as rotas a serem seguidas na interface grafica, baseado nas coordenadas GUI
    public List < CaminhoGUI > gerarRotasGUI()
    {
        int contador = 0;
        rotasGUI = new ArrayList<>();

        while (caminhosGUI.isEmpty() == false)
        {
            int xAtual, yAtual, xProximo, yProximo, xInicial, yInicial;

            xAtual = caminhosGUI.get(0).get(0);
            yAtual = caminhosGUI.get(0).get(1);

            xInicial = caminhosGUI.get(0).get(0);
            yInicial = caminhosGUI.get(0).get(1);

            if(caminhosGUI.size() == 1)
            {
                contador++;
                break;
            }

            xProximo = caminhosGUI.get(1).get(0);
            yProximo = caminhosGUI.get(1).get(1);

            if(xAtual + 1 == xProximo) //direita
            {
                contador++;

                caminhosGUI.remove(0);
                xAtual = caminhosGUI.get(0).get(0);
                if(caminhosGUI.size() == 1)
                {
                    contador++;
                    break;
                }
                xProximo = caminhosGUI.get(1).get(0);

                while (caminhosGUI.isEmpty() == false && xAtual + 1 == xProximo)
                {
                    contador++;

                    caminhosGUI.remove(0);
                    xAtual = caminhosGUI.get(0).get(0);
                    if(caminhosGUI.size() == 1)
                    {
                        contador++;
                        break;
                    }
                    xProximo = caminhosGUI.get(1).get(0);
                }

                rotasGUI.add(new CaminhoGUI("direita", contador, xInicial, yInicial));
                contador = 0;

            }
            else if(xAtual - 1 == xProximo) //esquerda
            {
                contador++;

                caminhosGUI.remove(0);
                xAtual = caminhosGUI.get(0).get(0);
                if(caminhosGUI.size() == 1)
                {
                    contador++;
                    break;
                }
                xProximo = caminhosGUI.get(1).get(0);

                while (caminhosGUI.isEmpty() == false && xAtual - 1 == xProximo)
                {
                    contador++;

                    caminhosGUI.remove(0);
                    xAtual = caminhosGUI.get(0).get(0);
                    if(caminhosGUI.size() == 1)
                    {
                        contador++;
                        break;
                    }
                    xProximo = caminhosGUI.get(1).get(0);
                }

                rotasGUI.add(new CaminhoGUI("esquerda", contador, xInicial, yInicial));
                contador = 0;
            }
            else if(yAtual + 1 == yProximo) //baixo
            {
                contador++;

                caminhosGUI.remove(0);
                yAtual = caminhosGUI.get(0).get(1);
                if(caminhosGUI.size() == 1)
                {
                    contador++;
                    break;
                }
                yProximo = caminhosGUI.get(1).get(1);

                while (caminhosGUI.isEmpty() == false && yAtual + 1 == yProximo)
                {
                    contador++;

                    caminhosGUI.remove(0);
                    yAtual = caminhosGUI.get(0).get(1);
                    if(caminhosGUI.size() == 1)
                    {
                        contador++;
                        break;
                    }
                    yProximo = caminhosGUI.get(1).get(1);
                }

                rotasGUI.add(new CaminhoGUI("baixo", contador, xInicial, yInicial));
                contador = 0;
            }
            else //cima
            {
                contador++;

                caminhosGUI.remove(0);
                yAtual = caminhosGUI.get(0).get(1);
                if(caminhosGUI.size() == 1)
                {
                    contador++;
                    break;
                }
                yProximo = caminhosGUI.get(1).get(1);

                while (caminhosGUI.isEmpty() == false && yAtual - 1 == yProximo)
                {
                    contador++;

                    caminhosGUI.remove(0);
                    yAtual = caminhosGUI.get(0).get(1);
                    if(caminhosGUI.size() == 1)
                    {
                        contador++;
                        break;
                    }
                    yProximo = caminhosGUI.get(1).get(1);
                }

                rotasGUI.add(new CaminhoGUI("cima", contador, xInicial, yInicial));
                contador = 0;
            }
        }
        return rotasGUI;
    }


    /// exibe no terminal as rotas seguidas na interface grafica
    public void exibeRotasGUI()
    {
        for(int i = 0; i < rotasGUI.size(); i++)
        {
            System.out.println("Direção: " + rotasGUI.get(i).getDirecao() + " Tamanho: " + rotasGUI.get(i).getTamanho());

        }
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
    }

    @Override
    public int getxDestino() {
        return super.getxDestino();
    }

    @Override
    public int getyDestino() {
        return super.getyDestino();
    }

    protected Aresta arestaOrigem, arestaDestino, arestaAtual, arestaProxima;
    protected List <Vertice> menorRota;
    protected List <String> rotaNosCruzamentos = new ArrayList<>();
    protected List < List < Integer > > caminhosGUI;
    protected List < CaminhoGUI > rotasGUI;
    protected boolean rotaAleatoria, proxArestaDefinida = false, cheguei = false, chegueiNaArestaDestino = false;
    protected boolean cruzandoQuadrante = false;
    protected int xCentral, yCentral;
}