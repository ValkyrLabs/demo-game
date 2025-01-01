import { ErrorMessage, Field, Formik, FormikHelpers, FormikValues } from 'formik';
import React from 'react';
import { Form as BSForm, Accordion, Col, Nav, Row, Spinner } from 'react-bootstrap';
import { FaCheckCircle, FaCogs, FaRegPlusSquare } from 'react-icons/fa';
import CoolButton from '../../../../components/CoolButton';
import * as Yup from 'yup';
import { Weapon, WeaponColorEnum, WeaponWeaponTypeEnum,  } from '../../../model';
import { useAddWeaponMutation } from '../../services/WeaponService';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com/thorapi

Powered by Swagger Codegen: http://swagger.io

Generated Details:
**GENERATOR VERSION:** 7.5.0
**GENERATED DATE:** 2024-12-30T08:46:46.125225-08:00[America/Los_Angeles]
**GENERATOR CLASS:** org.openapitools.codegen.languages.TypeScriptReduxQueryClientCodegen

Template file: typescript-redux-query/modelForm.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Weapon
*/

{/* ENUMS FOR FORM VALIDATIONS */}

    

const ColorValidation = () => { 
  return(
    [
      'BLACK', 'CAMO-AIRFORCE', 'CAMO-MARINE', 'CAMO-NAVY', 'CAMO-ARMY', 'GRAY', 'OLIVE', 'SILVER', 'GOLD', 'EXOTIC', 
    ]
  )
};

const WeaponTypeValidation = () => { 
  return(
    [
      'BALLISTiC', 'PROJECTILE', 'FIRE', 'KINETIC', 'NUCLEAR', 'MUNITIONS', 'MELEE', 'AIRCRAFT', 'VESSELS', 'BOWS', 'SLINGS', 
    ]
  )
};



{/* MUSTACHE FORM VALIDATIONS */}
const validationSchema = Yup.object().shape({

     name: Yup.string()
    
    
    
    
    ,
         harmLevel: Yup.number()
    
    
    
    
    ,
     weight: Yup.number()
    
    
    
    
    ,
     color: Yup.string().oneOf(ColorValidation(), 'Invalid value selected for color')
    
    
    
    
    ,
     weaponType: Yup.string().oneOf(WeaponTypeValidation(), 'Invalid value selected for weaponType')
    
    
    
    
    ,
     id: Yup.string()
    
    
    
    
    ,
     ownerId: Yup.string()
    
    
    
    
    ,
     createdDate: Yup.date()
    
    
    
    
    ,
     keyHash: Yup.string()
    
    
    
    
    ,
     lastAccessedById: Yup.string()
    
    
    
    
    ,
     lastAccessedDate: Yup.date()
    
    
    
    
    ,
     lastModifiedById: Yup.string()
    
    
    
    
    ,
     lastModifiedDate: Yup.date()
    
    
    
    
    ,

});

const WeaponForm: React.FC = () => {
  const [addWeapon, addWeaponResult] = useAddWeaponMutation();

  const initialValues: Weapon = {
    
    
    name : 'null',
    
    
    
    
    
    
    
    
    
    harmLevel : 0, 
    
    
    
    
    
    
    
    weight : 0, 
    
    
    
        color :   WeaponColorEnum[Object.keys(WeaponColorEnum)[0]], 
        weaponType :   WeaponWeaponTypeEnum[Object.keys(WeaponWeaponTypeEnum)[0]], 
    
    
    id : 'bcf8e18c-e80c-4825-a041-62d9f08538a5',
    
    
    
    
    
    
    
    ownerId : 'bf453a56-e653-4c39-8e91-38cf51c659b6',
    
    
    
    
    
    
    
    
    createdDate : new Date(), 
    
    
    
    
    
    
    keyHash : 'null',
    
    
    
    
    
    
    
    lastAccessedById : 'c40d0399-62e2-46cb-bc73-6fb27daeb79c',
    
    
    
    
    
    
    
    
    lastAccessedDate : new Date(), 
    
    
    
    
    
    
    lastModifiedById : 'c1a21a04-eeb7-4cf5-8d71-4f31dab78500',
    
    
    
    
    
    
    
    
    lastModifiedDate : new Date(), 
    
    
    
    
    
  };

  const handleSubmit = (values: FormikValues,
    { setSubmitting }: FormikHelpers<Weapon>) => {
    setTimeout(() => {
      console.log(values);
      addWeapon(values);
      setSubmitting(false);
    }, 500);
  }

  return (
    <div>
      <Formik
        validateOnBlur={true}
        initialValues={initialValues}
        validationSchema={validationSchema}
        onSubmit={handleSubmit}
      >

        {({ isSubmitting, isValid, errors, setFieldValue, touched, setFieldTouched, handleSubmit }) => (
          <form onSubmit={handleSubmit} className="form">

                    <Accordion
                      defaultActiveKey="1"
                    >
                      <Accordion.Item eventKey="0">
                        <Accordion.Header><FaCogs size={36}/></Accordion.Header>
                        <Accordion.Body>
                          errors: {JSON.stringify(errors)}
                          <br />
                          touched: {JSON.stringify(touched)}
                          <br />
                          addWeaponResult: {JSON.stringify(addWeaponResult)}
                        </Accordion.Body>
                      </Accordion.Item>

                      <Accordion.Item eventKey="1">
                        <Accordion.Header><FaRegPlusSquare  size={36}/> Add New Weapon</Accordion.Header>
                        <Accordion.Body>

        {/* MUSTACHE FORM FIELDS */}


        
            <label htmlFor="name" className="nice-form-control">
              <b>Name: {touched.name && !errors.name && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* name  TEXT FIELD */}
              <Field name="name" type="text"
                className={errors.name  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="name" component="span" />
            </label>


        
            <label htmlFor="harmLevel" className="nice-form-control">
              <b>Harm Level: {touched.harmLevel && !errors.harmLevel && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
          {/*harmLevel INTEGER FIELD */}
              <Field name="harmLevel" type="text"
                className={errors.harmLevel  ? 'form-control field-error' : ' nice-form-control form-control'} />
          
              
                        <ErrorMessage className='error' name="harmLevel" component="span" />
            </label>


        
            <label htmlFor="weight" className="nice-form-control">
              <b>Weight: {touched.weight && !errors.weight && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
          {/*weight INTEGER FIELD */}
              <Field name="weight" type="text"
                className={errors.weight  ? 'form-control field-error' : ' nice-form-control form-control'} />
          
              
                        <ErrorMessage className='error' name="weight" component="span" />
            </label>


        
            <label htmlFor="color" className="nice-form-control">
              <b>Color: {touched.color && !errors.color && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="color"
                className={errors.color ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('color', true);
                  setFieldValue('color', e.target.value);
                }}
              >
                <option value="" label="Select Color" />
                <ColorLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="color" component="span" />
            </label>


        
            <label htmlFor="weaponType" className="nice-form-control">
              <b>Weapon Type: {touched.weaponType && !errors.weaponType && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="weaponType"
                className={errors.weaponType ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('weaponType', true);
                  setFieldValue('weaponType', e.target.value);
                }}
              >
                <option value="" label="Select Weapon Type" />
                <WeaponTypeLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="weaponType" component="span" />
            </label>


        
            <label htmlFor="id" className="nice-form-control">
              <b>Id: {touched.id && !errors.id && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* id  TEXT FIELD */}
              <Field name="id" type="text"
                className={errors.id  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="id" component="span" />
            </label>


        
            <label htmlFor="ownerId" className="nice-form-control">
              <b>Owner Id: {touched.ownerId && !errors.ownerId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* ownerId  TEXT FIELD */}
              <Field name="ownerId" type="text"
                className={errors.ownerId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="ownerId" component="span" />
            </label>


        
            <label htmlFor="createdDate" className="nice-form-control">
              <b>Created Date: {touched.createdDate && !errors.createdDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*createdDate DATE FIELD */}
              <Field name="createdDate" type="date"
                className={errors.createdDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="createdDate" component="span" />
            </label>


        
            <label htmlFor="keyHash" className="nice-form-control">
              <b>Key Hash: {touched.keyHash && !errors.keyHash && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* keyHash  TEXT FIELD */}
              <Field name="keyHash" type="text"
                className={errors.keyHash  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="keyHash" component="span" />
            </label>


        
            <label htmlFor="lastAccessedById" className="nice-form-control">
              <b>Last Accessed By Id: {touched.lastAccessedById && !errors.lastAccessedById && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* lastAccessedById  TEXT FIELD */}
              <Field name="lastAccessedById" type="text"
                className={errors.lastAccessedById  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="lastAccessedById" component="span" />
            </label>


        
            <label htmlFor="lastAccessedDate" className="nice-form-control">
              <b>Last Accessed Date: {touched.lastAccessedDate && !errors.lastAccessedDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*lastAccessedDate DATE FIELD */}
              <Field name="lastAccessedDate" type="date"
                className={errors.lastAccessedDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="lastAccessedDate" component="span" />
            </label>


        
            <label htmlFor="lastModifiedById" className="nice-form-control">
              <b>Last Modified By Id: {touched.lastModifiedById && !errors.lastModifiedById && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* lastModifiedById  TEXT FIELD */}
              <Field name="lastModifiedById" type="text"
                className={errors.lastModifiedById  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="lastModifiedById" component="span" />
            </label>


        
            <label htmlFor="lastModifiedDate" className="nice-form-control">
              <b>Last Modified Date: {touched.lastModifiedDate && !errors.lastModifiedDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*lastModifiedDate DATE FIELD */}
              <Field name="lastModifiedDate" type="date"
                className={errors.lastModifiedDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="lastModifiedDate" component="span" />
            </label>

 
<br /><br />

                    <CoolButton
                      variant={(touched && isValid) ? (isSubmitting ? 'disabled' : 'success') : 'warning'}
                      type="submit"
                      onClick={() => { }}
                    >
                      {isSubmitting && (
                        <Spinner
                          style={ { float: "left" } }
                          as="span"
                          animation="grow"
                          variant="light"
                          aria-hidden="true"
                        />
                      )}
                      <FaCheckCircle size={30} /> Create New Weapon
                    </CoolButton>


                        </Accordion.Body>
                      </Accordion.Item>
                    </Accordion>

          </form>
        )}
    </Formik>
    </div >
  );
};

/*

lowercase colorlookup
uppercase COLORLOOKUP
snakecase color_lookup
pascalcase ColorLookup
camelcase colorLookup
kebabcase color-lookup


*/

const ColorLookup = () => { 
  return(
  <>
    
    <option value='BLACK' label='Black' />
    
    
    <option value='CAMO-AIRFORCE' label='Camo Airforce' />
    
    
    <option value='CAMO-MARINE' label='Camo Marine' />
    
    
    <option value='CAMO-NAVY' label='Camo Navy' />
    
    
    <option value='CAMO-ARMY' label='Camo Army' />
    
    
    <option value='GRAY' label='Gray' />
    
    
    <option value='OLIVE' label='Olive' />
    
    
    <option value='SILVER' label='Silver' />
    
    
    <option value='GOLD' label='Gold' />
    
    
    <option value='EXOTIC' label='Exotic' />
    
  </>
  )
};



/*

lowercase weapontypelookup
uppercase WEAPONTYPELOOKUP
snakecase weapon_type_lookup
pascalcase WeaponTypeLookup
camelcase weaponTypeLookup
kebabcase weapon-type-lookup


*/

const WeaponTypeLookup = () => { 
  return(
  <>
    
    <option value='BALLISTiC' label='Ballisti C' />
    
    
    <option value='PROJECTILE' label='Projectile' />
    
    
    <option value='FIRE' label='Fire' />
    
    
    <option value='KINETIC' label='Kinetic' />
    
    
    <option value='NUCLEAR' label='Nuclear' />
    
    
    <option value='MUNITIONS' label='Munitions' />
    
    
    <option value='MELEE' label='Melee' />
    
    
    <option value='AIRCRAFT' label='Aircraft' />
    
    
    <option value='VESSELS' label='Vessels' />
    
    
    <option value='BOWS' label='Bows' />
    
    
    <option value='SLINGS' label='Slings' />
    
  </>
  )
};






export default WeaponForm;
