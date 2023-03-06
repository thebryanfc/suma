import java.util.Scanner;

    public class Alumno {
        Scanner l=new Scanner(System.in);
        private int Investigacion,Poo,ProgramacionWeb,FundamentosProgramacion;
        private double PromedioSemestre,PromedioGeneral,Materia;
        private long ControlNumber=20670348;
        private String Name="Bryan Yaziel Figueroa Castillo";
        private String Carrera="Ingeneria En Informatica";
        private Short Semestre=6;

        public double getPromedioSemestre() {
            return PromedioSemestre;
        }

        public void setPromedioSemestre(int promedioSemestre) {
            PromedioSemestre = promedioSemestre;
        }

        public double getPromedioGeneral() {
            return PromedioGeneral;
        }

        public void setPromedioGeneral(int promedioGeneral) {
            PromedioGeneral = promedioGeneral;
        }

        public double getMateria() {
            return Materia;
        }

        public void setMateria(int materia) {
            Materia = materia;
        }

        public long getControlNumber() {
            return ControlNumber;
        }

        public void setControlNumber(long controlNumber) {
            ControlNumber = controlNumber;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getCarrera() {
            return Carrera;
        }

        public void setCarrera(String carrera) {
            Carrera = carrera;
        }

        public Short getSemestre() {
            return Semestre;
        }

        public void setSemestre(Short semestre) {
            Semestre = semestre;
        }


    }