package aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CrmLogginAspect {

	// now create point cuts and aspects

	// set up logger
	private Logger mylogger = Logger.getLogger(getClass().getName());

	// add point cut

	@Pointcut("execution(* controller.CustomerController.*(..))")
	public void pointcutforControllerPackage() {
	}

	@Pointcut("execution(* dao.CustomerDaoImpl.*(..))")
	public void pointcutfordaoPackage() {
	}

	@Pointcut("pointcutforControllerPackage() || pointcutfordaoPackage()")
	private void Appflow() {
	}

	// setup @before advice

	@Before("Appflow()")
	public void beforeadvice(JoinPoint jp) {

		Signature signature = jp.getSignature();

		Object[] args = jp.getArgs();

		mylogger.info("method Signature from @Before is " + signature.toShortString());
	}

	// setup @ AfterReturning advice
}
