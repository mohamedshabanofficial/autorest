/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydate;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodydate.models.ErrorException;
import java.io.IOException;
import org.joda.time.LocalDate;

/**
 * An instance of this class provides access to all the operations defined
 * in Dates.
 */
public interface Dates {
    /**
     * Get null date value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the LocalDate object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<LocalDate> getNull() throws ErrorException, IOException;

    /**
     * Get null date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<LocalDate> getNullAsync(final ServiceCallback<LocalDate> serviceCallback) throws IllegalArgumentException;

    /**
     * Get invalid date value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the LocalDate object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<LocalDate> getInvalidDate() throws ErrorException, IOException;

    /**
     * Get invalid date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<LocalDate> getInvalidDateAsync(final ServiceCallback<LocalDate> serviceCallback) throws IllegalArgumentException;

    /**
     * Get overflow date value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the LocalDate object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<LocalDate> getOverflowDate() throws ErrorException, IOException;

    /**
     * Get overflow date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<LocalDate> getOverflowDateAsync(final ServiceCallback<LocalDate> serviceCallback) throws IllegalArgumentException;

    /**
     * Get underflow date value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the LocalDate object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<LocalDate> getUnderflowDate() throws ErrorException, IOException;

    /**
     * Get underflow date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<LocalDate> getUnderflowDateAsync(final ServiceCallback<LocalDate> serviceCallback) throws IllegalArgumentException;

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putMaxDate(LocalDate dateBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putMaxDateAsync(LocalDate dateBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get max date value 9999-12-31.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the LocalDate object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<LocalDate> getMaxDate() throws ErrorException, IOException;

    /**
     * Get max date value 9999-12-31.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<LocalDate> getMaxDateAsync(final ServiceCallback<LocalDate> serviceCallback) throws IllegalArgumentException;

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putMinDate(LocalDate dateBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> putMinDateAsync(LocalDate dateBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get min date value 0000-01-01.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the LocalDate object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<LocalDate> getMinDate() throws ErrorException, IOException;

    /**
     * Get min date value 0000-01-01.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall<LocalDate> getMinDateAsync(final ServiceCallback<LocalDate> serviceCallback) throws IllegalArgumentException;

}
