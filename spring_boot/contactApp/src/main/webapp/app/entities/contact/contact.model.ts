import { IAddress } from 'app/entities/address/address.model';
import { IProject } from 'app/entities/project/project.model';

export interface IContact {
  id?: number;
  contactId?: number;
  name?: string;
  email?: string;
  phoneNumber?: string;
  contactAddresses?: IAddress[] | null;
  contactProjects?: IProject[] | null;
}

export class Contact implements IContact {
  constructor(
    public id?: number,
    public contactId?: number,
    public name?: string,
    public email?: string,
    public phoneNumber?: string,
    public contactAddresses?: IAddress[] | null,
    public contactProjects?: IProject[] | null
  ) {}
}

export function getContactIdentifier(contact: IContact): number | undefined {
  return contact.id;
}
