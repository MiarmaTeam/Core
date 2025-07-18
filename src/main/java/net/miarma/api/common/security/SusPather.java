package net.miarma.api.common.security;

/**
 * Clase que verifica si una ruta es sospechosa o no.
 * Utilizada para evitar el acceso a rutas potencialmente peligrosas.
 *
 * @author José Manuel Amador Gallardo
 */
public class SusPather {
	public static boolean isSusPath(String path) {
		return path.endsWith(".env") ||
		           path.endsWith(".git") ||
		           path.endsWith(".DS_Store") ||
		           path.endsWith("wp-login.php") ||
		           path.endsWith("admin.php") ||
		           path.contains(".git/") ||
		           path.contains(".svn/") ||
		           path.contains(".idea/") ||
		           path.contains(".vscode/") ||
		           path.contains(".settings/") ||
		           path.contains(".classpath") ||
		           path.contains(".project");
	}
}
