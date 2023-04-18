package br.com.artcomp.utilitarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Artbook
 */
public class BackupPostgresql {

    public static void realizaBackup() throws  InterruptedException {

        final List<String> comandos = new ArrayList<>();
        String dir = "C:/Backup";
        List<String> lista = new ArrayList<>(10);
        File diretorio = new File(dir);
        File VList[] = diretorio.listFiles();
        
        if (VList.length == 0) {
            System.out.println("é igual a zero");
            
            
            //comandos.add("C:\\Program Files (x86)\\PostgreSQL\\9.2\\bin\\pg_dump.exe");
            comandos.add("C:\\Program Files (x86)\\PostgreSQL\\9.2\\bin\\pg_dump.exe");
            comandos.add("-i");
            comandos.add("-h");            
            comandos.add("localhost");
            comandos.add("-p");
            comandos.add("5432");
            comandos.add("-U");//nome do usuario
            comandos.add("postgres");
            comandos.add("-F");
            comandos.add("c");
            comandos.add("-b");
            comandos.add("-v");
            comandos.add("-f");//nome do banco
            //se não tiver nada na pasta ele coloca na posição 1;
            //comandos.add(dir +1+" " + getDateTime() + ".backup");
             comandos.add("c:\\Backup\\" +1+ " Backup - BaseSupportTools");
            comandos.add("agenda");
            
            ProcessBuilder pb = new ProcessBuilder(comandos);
            pb.environment().put("PGPASSWORD", "artur");            
            
            try {
                
                final Process process = pb.start();
                System.out.println("carregou");
                final BufferedReader buf = new BufferedReader(
                        new InputStreamReader(process.getErrorStream()));
                String line = buf.readLine();
                System.out.println("chegou aqui");
                while (line != null) {
                    System.err.println(line);
                    line = buf.readLine();
                }

                buf.close();

                process.waitFor();
                process.destroy();
                //new RemoveBKP();//classe que apaga backup

                JOptionPane.showMessageDialog(null, "Backup realizado com sucesso!");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        } else {
            System.out.println("tem algo lá");
            for (int i = 0; i < VList.length; i++) {
                lista.add(VList[i].getName());
            }

            char recebe = Collections.max(lista).charAt(0);

            comandos.add("C:\\Program Files (x86)\\PostgreSQL\\9.2\\bin\\pg_dump.exe");
            comandos.add("-i");
            comandos.add("-h");            
            comandos.add("localhost");
            comandos.add("-p");
            comandos.add("5432");
            comandos.add("-U");//nome do usuario
            comandos.add("postgres");
            comandos.add("-F");
            comandos.add("c");
            comandos.add("-b");
            comandos.add("-v");
            comandos.add("-f");//nome do banco

            //se ja tiver arquivos ele pega rebebe que recebeu a ultima posição da pasta 
            comandos.add("c:\\Backup\\" + (Character.getNumericValue(recebe) + 1) + " Backup - BaseSupportTools");
            comandos.add("agenda");

            ProcessBuilder pb = new ProcessBuilder(comandos);            
            pb.environment().put("PGPASSWORD", "artur");
            try {

                final Process process = pb.start();
                final BufferedReader buf = new BufferedReader(
                        new InputStreamReader(process.getErrorStream()));
                String line = buf.readLine();

                while (line != null) {
                    System.err.println(line);
                    line = buf.readLine();
                }

                buf.close();

                process.waitFor();
                process.destroy();
                //new RemoveBKP();//classe que apaga backup

                JOptionPane.showMessageDialog(null, "Backup realizado com sucesso!");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }

        }

    }
//    public String getDateTime(){
//        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy MMnn");
//        return dateFormat.format(date);
//    }
}
