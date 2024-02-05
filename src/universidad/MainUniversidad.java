package universidad;

public class MainUniversidad {
    public static void main(String[] args) {
        //------------------------------------------ÁREAS DE CONOCIMIENTO----------------------------------------------
        AreaConocimiento ciencia = new AreaConocimiento("AreaCiencia");
        //------------------------------------------DEPARTAMENTOS------------------------------------------------------
        Departamento matematicas = new Departamento("DMath","Departamento de Matemáticas",ciencia);
        Departamento fisica = new Departamento("DFis","Departamento de Física",ciencia);
        Departamento biologia = new Departamento("Dbio","Departamento de Biología",ciencia);
        //-------------------------------------------PROFESORES--------------------------------------------------------
        Profesor pepe = new Profesor("12345678A","Pepe Gonzalez",matematicas);
        Profesor maria = new Profesor("87654321A","María Martinez",fisica);
        Profesor juan = new Profesor("12345678B","Juan Jímenez",biologia);
        //------------------------------------------CATEDRA------------------------------------------------------------
        Catedra matematicasAplicadas = new Catedra("mat1","Cátedra de Matemáticas",matematicas);
        Catedra fisicaCuantica = new Catedra("fis1","Cátedra de Física Cuántica",fisica);
        Catedra biotecnologia = new Catedra("bio1","Cátedra de biotecnología",biologia);
        Catedra microbiologia = new Catedra("bio2","Cátedra de Microbiología",biologia);
        //-----------------------------------------FACULTAD-------------------------------------------------------------
        Facultad cienciasPuras = new Facultad("FCP","Facultad de ciencias Puras",matematicasAplicadas);
        Facultad fBiologia = new Facultad("FB","Facultad de Biología",biotecnologia);
        //------------------------------------------ADSCRITOS-----------------------------------------------------------
        Adscrito pepeAds1 = new Adscrito("01-01-1980",pepe,matematicasAplicadas);
        Adscrito mariaAds1 = new Adscrito("01-01-2005",maria,fisicaCuantica);
        Adscrito juanAds1 = new Adscrito("01-01-2000",juan,biotecnologia);
        Adscrito juanAds2 = new Adscrito("01-01-2008",juan,microbiologia);
        //------------------------------------------AÑADIENDO-----------------------------------------------------------
        ciencia.addDepartamento(matematicas);
        ciencia.addDepartamento(fisica);
        ciencia.addDepartamento(biologia);

        matematicas.addProfesor(pepe);
        fisica.addProfesor(maria);
        biologia.addProfesor(juan);

        matematicas.addCatedra(matematicasAplicadas);
        fisica.addCatedra(fisicaCuantica);
        biologia.addCatedra(biotecnologia);
        biologia.addCatedra(microbiologia);

        pepe.addCatedra(matematicasAplicadas);
        maria.addCatedra(fisicaCuantica);
        juan.addCatedra(biotecnologia);
        juan.addCatedra(microbiologia);

        matematicasAplicadas.addFacultad(cienciasPuras);
        fisicaCuantica.addFacultad(cienciasPuras);
        biotecnologia.addFacultad(fBiologia);
        microbiologia.addFacultad(fBiologia);

        matematicasAplicadas.addProfesor(pepe);
        fisicaCuantica.addProfesor(maria);
        biotecnologia.addProfesor(juan);
        microbiologia.addProfesor(juan);

        //Adscritos
        pepe.addAdscrito(pepeAds1);
        maria.addAdscrito(mariaAds1);
        juan.addAdscrito(juanAds1);
        juan.addAdscrito(juanAds2);

        matematicasAplicadas.addAdscrito(pepeAds1);
        fisicaCuantica.addAdscrito(mariaAds1);
        biotecnologia.addAdscrito(juanAds1);
        microbiologia.addAdscrito(juanAds2);
        //------------------------------------PROBANDO EL PROGRAMA------------------------------------------------------
        System.out.println("Área de conocimiento : "+ciencia);
        for(Departamento d: ciencia.getDepartamentos()){
            System.out.println("\tDepartamentos: "+d);
            for (Catedra c: d.getCatedras()){
                System.out.println("\t\tCátedra: "+c);
                for (Profesor p: c.getProfesores()){
                    System.out.println("\t\t\tProfesor que imparte la cátedra: "+p);
                    for(Adscrito a: p.getAdscritos()){
                        if(a.getCatedra() == c){
                            System.out.println("\t\t\tAño desde que la imparte: "+a.getFecha());
                        }
                    }
                }
                for (Facultad f: c.getFacultades()){
                    System.out.println("\t\t\tFacultad en que es impartida: "+f);
                }
            }
        }
    }
}
