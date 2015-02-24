/**
 *
 */
package de.hybris.platform.cuppytrail.facades;

/**
 * @author YLi
 *
 */
import de.hybris.platform.cuppytrail.data.StadiumData;

import java.util.List;


public interface StadiumFacade
{
	StadiumData getStadium(String name);

	StadiumData getStadium(String name, String format);

	List<StadiumData> getStadiums();

	List<StadiumData> getStadiums(String format);

}